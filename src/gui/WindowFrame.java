package gui;

import javax.swing.*;
import function.ScheduleFunction;
import guiAdder.*;
import guiSaver.*;
import serialChecker.*;

public class WindowFrame extends JFrame {
	ScheduleFunction schfunction;
	MenuSelection menuselection;
	AdderMenu addermenu;
	MeetingAdder meetingadder;
	MeetingS meetingsaver;
	ShoppingAdder shoppingadder;
	ShoppingS shoppingsaver;
	StudyingAdder studyingadder;
	StudyingS studyingsaver;
	RestingAdder restingadder;
	RestingS restingsaver;
	AllViewer allviewer;
	DelSerialC delserialchecker;
	DeleteS deletes;
	EditSerialC editserialchecker;
	EditS edits;
	ViewSerialC viewserialchecker;
	Editor editor;
	OneViewer oneviewer;

	public WindowFrame(ScheduleFunction schfunction) {
		this.setSize(800, 400); // 창의 크기를 지정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창을 닫으면 프로그램 종료
		
		this.schfunction = schfunction;
		menuselection = new MenuSelection(this, this.schfunction);
		addermenu = new AdderMenu(this, this.schfunction);
		meetingadder = new MeetingAdder(this, this.schfunction);
		shoppingadder = new ShoppingAdder(this, this.schfunction);
		studyingadder = new StudyingAdder(this, this.schfunction);
		restingadder = new RestingAdder(this, this.schfunction);
		delserialchecker = new DelSerialC(this, this.schfunction);
		deletes = new DeleteS(this, this.schfunction);
		editserialchecker = new EditSerialC(this, this.schfunction);
		editor = new Editor(this,this.schfunction);
		edits = new EditS(this, this.schfunction);
		meetingsaver = new MeetingS(this, this.schfunction);
		shoppingsaver = new ShoppingS(this, this.schfunction);
		studyingsaver = new StudyingS(this, this.schfunction);
		restingsaver = new RestingS(this, this.schfunction);
		viewserialchecker = new ViewSerialC(this, this.schfunction);
		oneviewer = new OneViewer(this, this.schfunction);
		allviewer = new AllViewer(this, this.schfunction);
		// 메뉴 선택, 일정 추가 메뉴, 일정 표시를 구현한 클래스 소환

		this.setupPanel(menuselection);
		this.setVisible(true); // 화면에 표시되도록 설정
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public MeetingAdder getAdder() {
		return meetingadder;
	}

	public void setMeetingAdder(MeetingAdder adder) {
		this.meetingadder = adder;
	}
	
	public MeetingS getMeetingsaver() {
		return meetingsaver;
	}

	public void setMeetingsaver(MeetingS meetingsaver) {
		this.meetingsaver = meetingsaver;
	}
	
	public ShoppingAdder getShoppingadder() {
		return shoppingadder;
	}

	public void setShoppingadder(ShoppingAdder shoppingadder) {
		this.shoppingadder = shoppingadder;
	}
	
	public ShoppingS getShoppingsaver() {
		return shoppingsaver;
	}

	public void setShoppingsaver(ShoppingS shoppingsaver) {
		this.shoppingsaver = shoppingsaver;
	}

	public StudyingAdder getStudyingadder() {
		return studyingadder;
	}

	public void setStudyingadder(StudyingAdder studyingadder) {
		this.studyingadder = studyingadder;
	}
	public StudyingS getStudyingsaver() {
		return studyingsaver;
	}

	public void setStudyingsaver(StudyingS studyingsaver) {
		this.studyingsaver = studyingsaver;
	}

	public RestingAdder getRestingadder() {
		return restingadder;
	}

	public void setRestingadder(RestingAdder restingadder) {
		this.restingadder = restingadder;
	}
	
	public RestingS getRestingsaver() {
		return restingsaver;
	}

	public void setRestingsaver(RestingS restingsaver) {
		this.restingsaver = restingsaver;
	}
	
	public AllViewer getViewer() {
		return allviewer;
	}

	public void setViewer(AllViewer viewer) {
		this.allviewer = viewer;
	}
	
	public AdderMenu getAdderMenu() {
		return addermenu;
	}
	
	public void setAdderMenu(AdderMenu addermenu) {
		this.addermenu = addermenu;
	}
	
	public DelSerialC getDelSerialChecker() {
		return delserialchecker;
	}
	
	public void setDelSerialChecker(DelSerialC delserialchecker) {
		this.delserialchecker = delserialchecker;
	}
	public DeleteS getDeletes() {
		return deletes;
	}

	public void setDeletes(DeleteS deletes) {
		this.deletes = deletes;
	}
	
	public EditSerialC getEditSerialChecker() {
		return editserialchecker;
	}
	
	public void setEditSerialChecker(EditSerialC editserialchecker) {
		this.editserialchecker = editserialchecker;
	}
	
	public Editor getEditor() {
		return editor;
	}

	public void setEditor(Editor editor) {
		this.editor = editor;
	}
	
	public EditS getEdits() {
		return edits;
	}

	public void setEdits(EditS edits) {
		this.edits = edits;
	}

	public ViewSerialC getViewserialchecker() {
		return viewserialchecker;
	}

	public void setViewserialchecker(ViewSerialC viewserialchecker) {
		this.viewserialchecker = viewserialchecker;
	}

	public OneViewer getOneviewer() {
		return oneviewer;
	}

	public void setOneviewer(OneViewer oneviewer) {
		this.oneviewer = oneviewer;
	}

}
