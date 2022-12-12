package junit5bazelhacks;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import org.junit.platform.console.ConsoleLauncher;
/**
 * @author spock
 */
public class JUnit5Launcher {

    public static void main(String[] args) {
    	// workaround for https://github.com/bazelbuild/bazel/issues/8317
    	List<String> newArgs = new ArrayList(Arrays.asList(args));
    	newArgs.add("--reports-dir");
    	newArgs.add(System.getenv("TEST_UNDECLARED_OUTPUTS_DIR"));
        ConsoleLauncher.main(newArgs.toArray(new String[0]));
    }
}
