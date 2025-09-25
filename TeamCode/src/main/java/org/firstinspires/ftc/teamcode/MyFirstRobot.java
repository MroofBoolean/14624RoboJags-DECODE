package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp(name="DudeManOpMode", group="Examples")
public class MyFirstRobot extends LinearOpMode {
    @Override
    public void runOpMode() {
        telemetry.addData("DudeManOS", "Initializing");
        telemetry.addData("DudeManOs", "Initialized");
        telemetry.addLine("########################################\n" +
                "#######+++##############################\n" +
                "######+-++##############################\n" +
                "#####+---+##+###########################\n" +
                "####+----++++++++#######################\n" +
                "####+-+--+++++++++######################\n" +
                "###+##+++-+++++++++#####################\n" +
                "###++++##-+++++++#######################\n" +
                "###+#-----+++##++#######################\n" +
                "####+--+++#####++#######################\n" +
                "####+++##++++++++#######################\n" +
                "###########+++++#+++####################\n" +
                "############++++########################\n" +
                "############+++#++#+++##################\n" +
                "###################++###################\n" +
                "##################++####################\n" +
                "#################+++##+#################\n" +
                "#####+###########+++++##################\n" +
                "####++##########+++++###################\n" +
                "################+++##++#################\n" +
                "################+++++###################\n" +
                "################++++####################\n");
        telemetry.update();

        // Wait for start button
        waitForStart();

        boolean toggle = true; // Used to switch messages

        while (opModeIsActive()) {
            if (toggle) {
                telemetry.addData("DudeManOS", "HEY DUDE MAN");
            } else {
                telemetry.addData("DudeManOS", "I'M A DUDE MAN");
            }

            telemetry.update(); // Push to Driver Station

            toggle = !toggle; // Switch for next loop

            sleep(1000); // 0.5 second delay for visible alternation
        }
    }
}

