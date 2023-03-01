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
        String cmds = "sh src/test/java/com/example/CSWS/shRunnerTest/runnerTest.sh";
        // 0번 인수 : 배쉬 쉘 실행파일 경로
        String[] callCmd = {"C:/Program Files/Git/git-bash.exe", "-c", cmds};
        Map map = shRunner.execCommand(callCmd);

        System.out.println(map);
    }

}