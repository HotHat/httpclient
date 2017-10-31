package com.lyhux.syntax.httpclient;

import okhttp3.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class LoaderHttpClient extends HttpClientBaseListener {
    public static void main(String[] args) throws IOException {
        ParseTreeWalker walker = new ParseTreeWalker();
        HttpClientBaseListener listener = new HttpClientBaseListener();

        //String fileName = LoaderHttpClient.class.getClassLoader().getResource("").toString();
        if (args.length != 1) {
            System.out.println("Usage: app tasks_file");
            return;
        }

        String fileName = args[0];
        HttpClientLexer lexer = new HttpClientLexer(CharStreams.fromFileName(fileName ));


        CommonTokenStream tokens = new CommonTokenStream(lexer);

        HttpClientParser parser = new HttpClientParser(tokens);

        ParseTree tree = parser.start();

        walker.walk(listener, tree);

        HttpClientParseResult result = listener.getResult();

        System.out.println(result.getMessage());
        System.out.println(result.isSuccess());

        System.out.println(result.getTasks());

        OkHttpClient client = new OkHttpClient.Builder().build();

        for (Task task: result.getTasks()) {
            try (Response response = client.newCall(task.getRequest()).execute()) {
                if (task.getOutputFile() != null) {
                    OutputStream file = new FileOutputStream(new File(task.getOutputFile()));
                    file.write(response.body().bytes());

                } else  {
                    System.out.println(response.body().string());
                }

            }

        }
    }

}
