

import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

public class SyntaxTest {
    @Test
    public void parseTest() {
        ParseTreeWalker walker = new ParseTreeWalker();

        // create listener then feed to walker
//        PropertyFileLoader loader = new PropertyFileLoader();
//        walker.walk(loader, tree); // walk parse tree System.out.println(loader.props); // print results
    }
}
