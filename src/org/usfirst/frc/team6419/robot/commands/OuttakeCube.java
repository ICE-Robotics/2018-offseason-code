package org.usfirst.frc.team6419.robot.commands;

import org.usfirst.frc.team6419.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class OuttakeCube extends Command {

    public OuttakeCube() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.intake.setPower(-1);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.intake.setPower(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	// Don't call end
    }
}
