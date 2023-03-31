package com.company.classicapp.screen.foo;

import io.jmix.ui.screen.*;
import com.company.model.entity.Foo;

@UiController("model_Foo.edit")
@UiDescriptor("foo-edit.xml")
@EditedEntityContainer("fooDc")
public class FooEdit extends StandardEditor<Foo> {
}