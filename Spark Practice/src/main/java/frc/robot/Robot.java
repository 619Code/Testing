/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {
  PWMSparkMax pracSpark;
  Joystick joystick;
  
  @Override
  public void robotInit() {
    pracSpark = new PWMSparkMax(0);
    joystick = new Joystick(0);
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
    double joystickVal = joystick.getRawAxis(5);
    boolean slow = joystick.getRawButton(10);
    if(Math.abs(joystickVal) < 0.1) {
      joystickVal = 0;
    } else if(slow) {
      joystickVal *= 0.5;
    }
    pracSpark.set(joystickVal);
  }

  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }

}
