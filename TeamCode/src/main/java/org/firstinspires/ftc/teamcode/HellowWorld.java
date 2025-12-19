package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@Autonomous
public class HellowWorld extends OpMode {//extends聲明這個"Class"(類)延伸自....繼承於某個父類


    @Override
    public void init() {
        telemetry.addData("Hello","CF");
    }


    @Override
    public void loop() {

    }
}

