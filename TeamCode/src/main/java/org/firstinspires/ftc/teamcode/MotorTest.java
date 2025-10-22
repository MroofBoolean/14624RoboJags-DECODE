package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="MotorTest", group="Examples")

//This TeleOp will be applied automatically to the robot and not need to be applied when selecting one.
public class MotorTest extends LinearOpMode {
    DcMotor motor0 = hardwareMap.get(DcMotor.class, "TL"); //"BottomLeft"
    DcMotor motor1 = hardwareMap.get(DcMotor.class, "TR"); //"BottomRight"
    DcMotor motor2 = hardwareMap.get(DcMotor.class, "BL"); //"TopLeft"
    DcMotor motor3 = hardwareMap.get(DcMotor.class, "BR"); //"TopRight"
    //Establishes the motors and servos in the configuration of the Driver Hub
    @Override
    public void runOpMode(){
        //motor0.setDirection(DcMotor.Direction.REVERSE);
        motor1.setDirection(DcMotor.Direction.REVERSE);
        //motor2.setDirection(DcMotor.Direction.REVERSE);
        motor3.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();
        while (opModeIsActive()){
            moveForward();

        }
    }
    public void moveForward(){
        motor0.setPower(gamepad1.left_stick_y);
        motor1.setPower(gamepad1.left_stick_y);
        motor2.setPower(gamepad1.left_stick_y);
        motor3.setPower(gamepad1.left_stick_y);
    }
    //Sets the Motor power to the left stick of a joystick (specifically the up and down axis)
}
