package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class CoursePane {
	private static final int BUTTON_WIDTH = 120;
	private static final int BUTTON_HEIGHT = 40;
	private TextField courseTitleShortField;
	private TextField courseTitleLongField;
	private TextField courseDescriptionField;
	private TextField facultyIDField;
	private TextField textbookISBNField;
	private TextField classroomField;

	private GridPane coursePane;
	private Button insertBtn;
	private Button searchBtn;
	private Button updateBtn;
	private Button deleteBtn;

	private HBox buttonBox;

	public CoursePane() {
		courseTitleShortField = new TextField();
		courseTitleShortField.setPromptText("Course Number");
		courseTitleLongField = new TextField();
		courseTitleLongField.setPromptText("Full Course Title");
		courseDescriptionField = new TextField();
		courseDescriptionField.setPromptText("Course Description");
		facultyIDField = new TextField();
		facultyIDField.setPromptText("Faculty ID");
		textbookISBNField = new TextField();
		textbookISBNField.setPromptText("Textbook ISBN");
		classroomField = new TextField();
		classroomField.setPromptText("Classroom");

		insertBtn = new Button("INSERT");
		insertBtn.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
		searchBtn = new Button("SEARCH");
		searchBtn.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
		updateBtn = new Button("UPDATE");
		updateBtn.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
		deleteBtn = new Button("DELETE");
		deleteBtn.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);

		coursePane = new GridPane();
		coursePane.setAlignment(Pos.CENTER);
		coursePane.setPadding(new Insets(20));
		coursePane.setVgap(20);
		coursePane.setHgap(20);
		buttonBox = new HBox(40);
		buttonBox.setAlignment(Pos.CENTER);
		buttonBox.getChildren().addAll(insertBtn, searchBtn, updateBtn, deleteBtn);
		buildPane();

	}

	public String getCourseTitleShort() {
		return courseTitleShortField.getText();
	}

	public String getCourseTitleLong() {
		return courseTitleLongField.getText();
	}

	public String getCourseDescription() {
		return courseDescriptionField.getText();
	}

	public String getFacultyID() {
		return facultyIDField.getText();
	}

	public String getTextbookISBN() {
		return textbookISBNField.getText();
	}

	public String getClassroom() {
		return classroomField.getText();
	}
	
	public Button getInsertBtn() {
		return insertBtn;
	}

	public Button getSearchBtn() {
		return searchBtn;
	}

	public Button getUpdateBtn() {
		return updateBtn;
	}

	public Button getDeleteBtn() {
		return deleteBtn;
	}

	public HBox getButtonBox() {
		return buttonBox;
	}

	private void buildPane() {
		coursePane.add(courseTitleShortField, 0, 0);
		coursePane.add(courseTitleLongField, 1, 0);
		coursePane.add(courseDescriptionField, 0, 1);
		coursePane.add(facultyIDField, 0, 2);
		coursePane.add(textbookISBNField, 1, 1);
		coursePane.add(classroomField, 1, 2);
		coursePane.add(buttonBox, 0, 3, 2, 1);
	}

	public Pane getCoursePane() {
		return coursePane;
	}

	public TextField getCourseTitleShortField() {
		return courseTitleShortField;
	}

	public void setCourseTitleShortField(TextField courseTitleShortField) {
		this.courseTitleShortField = courseTitleShortField;
	}

	public TextField getCourseTitleLongField() {
		return courseTitleLongField;
	}

	public void setCourseTitleLongField(TextField courseTitleLongField) {
		this.courseTitleLongField = courseTitleLongField;
	}

	public TextField getCourseDescriptionField() {
		return courseDescriptionField;
	}

	public TextField getFacultyIDField() {
		return facultyIDField;
	}

	public void setCourseDescriptionField(TextField courseDescriptionField) {
		this.courseDescriptionField = courseDescriptionField;
	}

	public void setFacultyIDField(TextField facultyIDField) {
		this.facultyIDField = facultyIDField;
	}

	public TextField getPriceField() {
		return textbookISBNField;
	}

	public void setTextbookISBNField(TextField textbookISBNField) {
		this.textbookISBNField = textbookISBNField;
	}

	public TextField getClassroomField() {
		return classroomField;
	}

	public void setClassroomField(TextField classroomField) {
		this.classroomField = classroomField;
	}

	public void clearAllFields() {
		courseTitleShortField.clear();
		courseTitleLongField.clear();
		courseDescriptionField.clear();
		facultyIDField.clear();
		textbookISBNField.clear();
		classroomField.clear();
	}

}