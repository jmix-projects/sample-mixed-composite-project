package com.company.flowapp.view.foo;

import com.company.model.entity.Foo;

import com.company.flowapp.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "foos/:id", layout = MainView.class)
@ViewController("model_Foo.detail")
@ViewDescriptor("foo-detail-view.xml")
@EditedEntityContainer("fooDc")
public class FooDetailView extends StandardDetailView<Foo> {
}