import org.junit.Test;
import org.mybatis.generator.api.ShellRunner;

public class MybatisGeneratorTool {

    @Test
    public void TestGenerator(){
        String[] args = new String[]{"D:/Source_Code/java/wisdondemo/wisdondemo-dao/src/test/resources/generator.xml"};
        ShellRunner.main(args);
    }
}
