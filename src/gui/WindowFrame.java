package gui;

import java.util.Scanner;

import javax.swing.*;

import function.ScheduleMethod;

public class WindowFrame extends JFrame {
	ScheduleMethod schfunction;
	MenuSelection menuselection;
	AdderMenu addermenu;
	MeetingAdder meetingadder;
	MeetingSaver meetingsaver;
	ShoppingAdder shoppingadder;
	StudyingAdder studyingadder;
	RestingAdder restingadder;
	AllViewer allviewer;
	DelSerialChecker delserialchecker;
	EditSerialChecker editserialchecker;
	ViewSerialChecker viewserialchecker;
	Editor editor;
	OneViewer oneviewer;

	public WindowFrame(ScheduleMethod schfunction) {
		this.setSize(800, 400); // 창의 크기를 지정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창을 닫으면 프로그램 종료
		
		this.schfunction = schfunction;
		menuselection = new MenuSelection(this, this.schfunction);
		addermenu = new AdderMenu(this, this.schfunction);
		meetingadder = new MeetingAdder(this, this.schfunction);
		meetingsaver = new MeetingSaver(this, this.schfunction);
		shoppingadder = new ShoppingAdder(this, this.schfunction);
		studyingadder = new StudyingAdder(this, this.schfunction);
		restingadder = new RestingAdder(this, this.schfunction);
		delserialchecker = new DelSerialChecker(this, this.schfunction);
		editserialchecker = new EditSerialChecker(this, this.schfunction);
		editor = new Editor(this,this.schfunction);
		viewserialchecker = new ViewSerialChecker(this, this.schfunction);
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
	
	public MeetingSaver getMeetingsaver() {
		return meetingsaver;
	}

	public void setMeetingsaver(MeetingSaver meetingsaver) {
		this.meetingsaver = meetingsaver;
	}

	
	public ShoppingAdder getShoppingadder() {
		return shoppingadder;
	}

	public void setShoppingadder(ShoppingAdder shoppingadder) {
		this.shoppingadder = shoppingadder;
	}

	public StudyingAdder getStudyingadder() {
		return studyingadder;
	}

	public void setStudyingadder(StudyingAdder studyingadder) {
		this.studyingadder = studyingadder;
	}

	public RestingAdder getRestingadder() {
		return restingadder;
	}

	public void setRestingadder(RestingAdder restingadder) {
		this.restingadder = restingadder;
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
	
	public DelSerialChecker getDelSerialChecker() {
		return delserialchecker;
	}
	
	public void setDelSerialChecker(DelSerialChecker delserialchecker) {
		this.delserialchecker = delserialchecker;
	}
	
	public EditSerialChecker getEditSerialChecker() {
		return editserialchecker;
	}
	
	public void setEditSerialChecker(EditSerialChecker editserialchecker) {
		this.editserialchecker = editserialchecker;
	}
	
	public Editor getEditor() {
		return editor;
	}

	public void setEditor(Editor editor) {
		this.editor = editor;
	}
	
	public ViewSerialChecker getViewserialchecker() {
		return viewserialchecker;
	}

	public void setViewserialchecker(ViewSerialChecker viewserialchecker) {
		this.viewserialchecker = viewserialchecker;
	}

	public OneViewer getOneviewer() {
		return oneviewer;
	}

	public void setOneviewer(OneViewer oneviewer) {
		this.oneviewer = oneviewer;
	}

}
