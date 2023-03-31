package com.company.classicapp.screen.foo;

import io.jmix.ui.screen.*;
import com.company.model.entity.Foo;

@UiController("model_Foo.browse")
@UiDescriptor("foo-browse.xml")
@LookupComponent("foosTable")
public class FooBrowse extends StandardLookup<Foo> {
}