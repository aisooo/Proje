package com.example;




import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.server.VaadinRequest;
import com.vaadin.flow.spring.annotation.SpringComponent;
import org.springframework.beans.factory.annotation.Autowired;



@SpringComponent

public class TodoUi extends UI{
    public static void main(String[] args){

    }


    private VerticalLayout root;

    @Autowired
    TodoLayout todoList;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        setupLayout();
        addHeader();
        addForm();
        addTodoList();
        addActionButtons();
    }

    private void setupLayout() {
        root = new VerticalLayout();

    }

    private void addHeader() {
        root.addComponentAsFirst(new Label("TODOs"));
    }

    private void addForm() {
        HorizontalLayout formLayout = new HorizontalLayout();


        TextField task = new TextField();

        Button add = new Button("Add");

        formLayout.add(task, add);
        root.addComponentAsFirst(formLayout);


    }

    private void addTodoList() {

        root.addComponentAsFirst(todoList);
    }

    private void addActionButtons() {
            root.add(new Button("Delete completed items"));



    }
}
