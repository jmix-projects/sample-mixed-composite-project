package com.company.flowapp.view.foo;

import com.company.model.entity.Foo;

import com.company.flowapp.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "foos", layout = MainView.class)
@ViewController("model_Foo.list")
@ViewDescriptor("foo-list-view.xml")
@LookupComponent("foosTable")
@DialogMode(width = "50em", height = "37.5em")
public class FooListView extends StandardListView<Foo> {
}