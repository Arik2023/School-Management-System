package com.project.schoolmanagment.payload.messages;

public class SuccessMessages {

  private SuccessMessages() {
  }


  //user
  public static final String USER_FOUND = "User is Found Successfully";
  public static final String USER_CREATE = "User is Saved";
  public static final String USER_DELETE = "User is deleted successfully";
  public static final String USER_UPDATE = "your information has been updated successfully";
  public static final String USER_UPDATE_MESSAGE = "User is Updated Successfully";
  public static final String PASSWORD_CHANGED_RESPONSE_MESSAGE = "Password Successfully Changed" ;

  //Education term
  public static final String EDUCATION_TERM_SAVE = "Education Term is Saved";
  public static final String EDUCATION_TERM_UPDATE = "Education Term is Updated Successfully";
  public static final String EDUCATION_TERM_DELETE = "Education Term is Deleted Successfully";

  //Lesson
  public static final String LESSON_SAVE = "Lesson is Saved";
  public static final String LESSON_DELETE = "Lesson is Deleted Successfully";
  public static final String LESSON_FOUND = "Lesson is Found Successfully";

  //Lesson program
  public static final String LESSON_PROGRAM_SAVE = "Lesson Program is Saved";
  public static final String LESSON_PROGRAM_DELETE = "Lesson Program is Deleted Successfully";
  public static final String LESSON_PROGRAM_ADD_TO_TEACHER = "Lesson Program added to teacher";
  public static final String LESSON_PROGRAM_ADD_TO_STUDENT = "Lesson Program added to student";
  
  
}
