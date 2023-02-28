package com.example.CSWS.shRunnerTest;

import com.example.CSWS.common.shRunner.ShRunner;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Map;

public class ShRunnerTest {

    ShRunner shRunner = new ShRunner();

    @Test
    public void name() throws IOException, InterruptedException {

        // 실행할 쉘 스크립트 경로(절대경로 혹은 저장소 루트로부터의 경로)
        String shScript = "runnerTest.sh";
        Map map = shRunner.execCommand(shScript);

        System.out.println(map);
    }
}