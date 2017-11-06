// Generated from HttpClient.g4 by ANTLR 4.7

package com.lyhux.syntax.httpclient;


import com.google.common.io.Files;
import okhttp3.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.util.*;

/**
 * This class provides an empty implementation of {@link HttpClientListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class HttpClientBaseListener implements HttpClientListener {
	enum Position {
		START, TASK, PARAM, HEADER, COOKIE, BODY, FORM_DATA, URL_ENCODE, RAW
	}

	enum BodyType {
		BODY_FORM_DATA, BODY_URL_ENCODE, RAW, NONE
	}
	private Position position;

	private Request.Builder builder;
	private HttpUrl.Builder urlBuilder;
	private FormBody.Builder formBodyBuilder;
	private MultipartBody.Builder multipartBuilder;
	private RequestBody rawBody;
	private String requestMethod;
	private List<Task> tastList = new ArrayList<>();
	private BodyType bodyType = BodyType.NONE;
	private Task.Builder taskBuilder;

	private boolean isSuccess = true;
	private String message = "well done";

	private final List<String> METHODS = Arrays.asList("get", "post", "put", "delete", "patch", "head");
	private final List<String> METHODS_WITH_BODY = Arrays.asList("post", "put", "patch");
	private final Map<String, String> MEDIA_TYPE = new HashMap<String, String>() {{
		put("txt", "text/plain");
		put("text", "text/plain");
		put("json", "application/json");
		put("xml", "application/xml");
		put("html", "text/html");
		put("octet", "application/octet-stream");
		put("pdf", "application/pdf");
	}};

	/**
	 * request body type 1: form data; 2: urlencode; 3: raw; 4: binary
	 */


	HttpClientBaseListener() {
		super();
		position = Position.START;
		isSuccess = true;
	}




	/**
	 * is where url and method sign in tast block
	 */
	private Integer tastUrlAndMethod;


	public HttpClientParseResult getResult() {
		return new HttpClientParseResult();
	}
	public boolean isFile(String val) {
		return val.startsWith("@");
	}
	public String getFileName(String val) {
		return val.substring(1);
	}

	public class HttpClientParseResult {

		public boolean isSuccess() {
			return isSuccess;
		}

		public String getMessage() {
			return message;
		}

		public List<Task> getTasks() {
			return tastList;
		}
	}

	private void setPosition(Position position) {
		this.position = position;
	}


	private void setErrorMessage(String msg) {
		isSuccess = false;
		message = msg;
	}

	private void setBodyType(BodyType type) {
		bodyType = type;
	}
	private BodyType getBodyType() {
		return bodyType;
	}
	private void condition(Position position, String message) {
		if (this.position != position) {
			isSuccess = false;
			this.message = message;
		}
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStart(HttpClientParser.StartContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStart(HttpClientParser.StartContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpr(HttpClientParser.ExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpr(HttpClientParser.ExprContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBlock(HttpClientParser.BlockContext ctx) {


		String blockKeyWord = ctx.blockKeyword().getText();


		Token token = ctx.getStart();

		if (blockKeyWord.equals("task")) {

			condition(Position.START, "Error happen at: (" + token.getLine() + ":" + token.getStartIndex()
					+ "). task block must at out most");

			setPosition(Position.TASK);

			builder = new Request.Builder();
			urlBuilder = new HttpUrl.Builder();
			formBodyBuilder = new FormBody.Builder();
			multipartBuilder = new MultipartBody.Builder();
			tastUrlAndMethod = new Integer(0);
			taskBuilder = new Task.Builder();


		} else if (blockKeyWord.equals("param")) {

			condition(Position.TASK, "Error happen at: (" + token.getLine() + ":" + token.getStartIndex()
					+ "). task block must at out most");

			setPosition(Position.PARAM);

			List<HttpClientParser.BodyContext> bodys = ctx.body();

			for (HttpClientParser.BodyContext bct : bodys) {
				HttpClientParser.PairContext pctx = bct.pair();
				String key = pctx.KEY().getText();
				String val = pctx.STRING().getText();

				urlBuilder.addQueryParameter(key, val);
			}



		} else if (blockKeyWord.equals("header")) {

			condition(Position.TASK, "Error happen at: (" + token.getLine() + ":" + token.getStartIndex()
					+ "). task block must at out most");
			setPosition(Position.HEADER);

			List<HttpClientParser.BodyContext> bodys = ctx.body();

			for (HttpClientParser.BodyContext bct : bodys) {
				HttpClientParser.PairContext pctx = bct.pair();
				String key = pctx.KEY().getText();
				String val = pctx.STRING().getText();

				builder.addHeader(key, val);
			}

		} else if (blockKeyWord.equals("cookie")) {

			condition(Position.TASK, "Error happen at: (" + token.getLine() + ":" + token.getStartIndex()
					+ "). task block must at out most");
			setPosition(Position.COOKIE);

		} else if (blockKeyWord.equals("body")) {

			condition(Position.TASK,"Error happen at: (" + token.getLine() + ":" + token.getStartIndex()
					+ "). body block must at in task" );
			setPosition(Position.BODY);

		} else if (blockKeyWord.equals("form-data")) {
			setBodyType(BodyType.BODY_FORM_DATA);
			condition(Position.BODY, "Error happen at: (" + token.getLine() + ":" + token.getStartIndex()
					+ "). form-data block must in body block");
			setPosition(Position.FORM_DATA);


		} else if (blockKeyWord.equals("form-urlencoded")) {
			setBodyType(BodyType.BODY_URL_ENCODE);
			condition(Position.BODY, "Error happen at: (" + token.getLine() + ":" + token.getStartIndex()
					+ "). form-urlencoded block must in body block");
			setPosition(Position.URL_ENCODE);


		} else if (blockKeyWord.equals("raw")) {
			setBodyType(BodyType.RAW);
			condition(Position.BODY, "Error happen at: (" + token.getLine() + ":" + token.getStartIndex()
					+ "). raw block must in body block");
			setPosition(Position.RAW);
		}

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBlock(HttpClientParser.BlockContext ctx) {

		switch (position) {
			case TASK:
				if (tastUrlAndMethod != 2) {
					setErrorMessage("task must have url and method!");
				}

				// only post patch put can have body
				if (METHODS_WITH_BODY.contains(requestMethod)) {

					switch (bodyType) {
						case BODY_FORM_DATA:
							builder.method(requestMethod.toUpperCase(), multipartBuilder.build());
							break;
						case BODY_URL_ENCODE:
							builder.method(requestMethod.toUpperCase(), formBodyBuilder.build());
							break;
						case RAW:
							builder.method(requestMethod.toUpperCase(), rawBody);
							break;
					}
				}

				Request request = builder.url(urlBuilder.build()).build();
				Task task = taskBuilder.addRequest(request).build();

				tastList.add(task);

				setPosition(Position.START);
				break;
			case PARAM:
				setPosition(Position.TASK);
				break;
			case HEADER:
				setPosition(Position.TASK);
				break;
			case COOKIE:
				setPosition(Position.TASK);
				break;
			case BODY:
				setPosition(Position.TASK);
				break;
			case FORM_DATA:
				setPosition(Position.BODY);
				break;
			case URL_ENCODE:
				setPosition(Position.BODY);
				break;
			case RAW:
				setPosition(Position.BODY);
				break;
		}

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSign(HttpClientParser.SignContext ctx) {
		String sign = ctx.signKeyword().getText();
		String val = ctx.STRING().getText();
		if (isFile(val)) {
			val = getFileName(val);
		}
		val = val.replace("\"", "");
		switch (position) {
			case TASK:
				if (sign.equals("url")) {
					tastUrlAndMethod += 1;
					urlBuilder = HttpUrl.parse(val).newBuilder();

				} else if (sign.equals("method")) {
					tastUrlAndMethod += 1;

					if (sign.equals("method") && METHODS.contains(val)) {

						requestMethod = val;
					}

				} else if (sign.equals("out")) {
					taskBuilder.addOutputFile(val);
				} else {
					setErrorMessage("task only support url and method sign or out");
				}
				break;
			case PARAM:
				setErrorMessage("Not support sign in param block");
				break;
			case HEADER:
				setErrorMessage("Not support sign in header block");
				break;
			case COOKIE:
				setErrorMessage("Not support sign in param block");
				break;
			case BODY:
				setErrorMessage("Not support sign in param block");
				break;
			case FORM_DATA:
				setErrorMessage("Not support sign in form-data block");
				break;
			case URL_ENCODE:
				setErrorMessage("Not support sign in param block");
				break;
			case RAW:
				setErrorMessage("Not support sign in param block");
				break;
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSign(HttpClientParser.SignContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBody(HttpClientParser.BodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBody(HttpClientParser.BodyContext ctx) {

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSignKeyword(HttpClientParser.SignKeywordContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSignKeyword(HttpClientParser.SignKeywordContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBlockKeyword(HttpClientParser.BlockKeywordContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBlockKeyword(HttpClientParser.BlockKeywordContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterPair(HttpClientParser.PairContext ctx) {
		String key = ctx.KEY().getText();
		String val = ctx.STRING().getText();
		boolean isfile = false;
		if (isFile(val)) {
			val = getFileName(val);
			isfile = true;
		}
		val = val.replace("\"", "");

		switch (position) {
			case TASK:
				setErrorMessage("Task block not support pair");
				break;
			case PARAM:
				urlBuilder.addQueryParameter(key, val);
				break;
			case HEADER:
				builder.addHeader(key, val);
				break;
			case COOKIE:
				if (key.equals("set-cookie")) {
					builder.addHeader(key, val);
				} else if (key.equals("file")) {
					taskBuilder.addCookieFile(val);
				} else {
					setErrorMessage("Cookie block only can set set-cookie pair or file pair");
				}

				break;
			case BODY:
				setErrorMessage("Body not support pair");
				break;
			case FORM_DATA:
				if (isfile) {
					String extension = Files.getFileExtension(val);
					MediaType type = MediaType.parse(MEDIA_TYPE.get(extension));

					if (type == null) {
						setErrorMessage(val + " media type not support");
					} else {
						multipartBuilder.addFormDataPart(
								key, val,
								RequestBody.create(type, new File(val))
						);
					}

				} else {
					multipartBuilder.addFormDataPart(key, val);
				}
				break;
			case URL_ENCODE:
				formBodyBuilder.add(key, val);
				break;
			case RAW:
				String mediaType = MEDIA_TYPE.get(key);
				if (mediaType == null) {
					setErrorMessage("Media type not support");
				} else {
					if (isFile(val)) {
						rawBody = RequestBody.create(MediaType.parse(mediaType), getFileName(val));
					} else {
						rawBody = RequestBody.create(MediaType.parse(mediaType), val);
					}

				}
				break;
		}

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPair(HttpClientParser.PairContext ctx) {

	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(ParserRuleContext ctx) {

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(ErrorNode node) { }
}
