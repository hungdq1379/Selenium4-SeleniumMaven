package qhung.com.bases;

import org.junit.jupiter.api.BeforeEach;

public class BaseChromeTest extends BaseTest{
    @BeforeEach
    public void setup() {
        startChromeDriver();
    }

}
