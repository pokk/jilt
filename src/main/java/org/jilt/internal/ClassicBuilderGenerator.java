package org.jilt.internal;

import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;

import javax.annotation.processing.Filer;
import javax.lang.model.element.Element;
import javax.lang.model.element.VariableElement;
import javax.lang.model.util.Elements;

class ClassicBuilderGenerator extends AbstractBuilderGenerator {
    public ClassicBuilderGenerator(Element targetClass, Elements elements, Filer filer) {
        super(targetClass, elements, filer);
    }

    @Override
    protected void generateClassesNeededByBuilder() {
    }

    @Override
    protected TypeName factoryMethodReturnType() {
        return builderClassTypeName();
    }

    @Override
    protected TypeName returnTypeForSetterFor(VariableElement field) {
        return builderClassTypeName();
    }

    @Override
    protected void enhance(TypeSpec.Builder builderClassBuilder) {
    }
}
