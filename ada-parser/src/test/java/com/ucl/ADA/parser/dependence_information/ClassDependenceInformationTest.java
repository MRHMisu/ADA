package com.ucl.ADA.parser.dependence_information;

import com.ucl.ADA.parser.dependence_information.invocation_information.AttributeInvocationInformation;
import com.ucl.ADA.parser.dependence_information.invocation_information.ConstructorInvocationInformation;
import com.ucl.ADA.parser.dependence_information.invocation_information.MethodInvocationInformation;
import com.ucl.ADA.parser.dependence_information.invocation_information.PackageInvocationInformation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class ClassDependenceInformationTest {

    private ClassDependenceInformation cdi;

    @BeforeEach
    void setUp() {
        cdi = new ClassDependenceInformation();
    }

    @Test
    void addNewAttribute_addNewElement() {
        AttributeInvocationInformation attributeInvocationInformation = new AttributeInvocationInformation("invocationInformationName");

        cdi.addNewAttribute(attributeInvocationInformation);

        assertThat(cdi.getAttributes()).containsExactly(attributeInvocationInformation);
    }

    @Test
    void addNewConstructor_addNewElement() {
        ConstructorInvocationInformation constructorInvocationInformation = new ConstructorInvocationInformation("constructorExample", new ArrayList<>(Arrays.asList("String FirstParameter", "Integer SecondParameter")));

        cdi.addNewConstructor(constructorInvocationInformation);

        assertThat(cdi.getConstructors()).containsExactly(constructorInvocationInformation);
    }

    @Test
    void addNewMethod_addNewElement() {
         MethodInvocationInformation methodInvocationInformation = new MethodInvocationInformation("methodExample", new ArrayList<>(Arrays.asList("String FirstParameter", "Integer SecondParameter")));

        cdi.addNewMethod(methodInvocationInformation);

        assertThat(cdi.getMethods()).containsExactly(methodInvocationInformation);
    }

    @Test
    void addNewGlobalData_addNewElement() {
         AttributeInvocationInformation attributeInvocationInformation = new AttributeInvocationInformation("globalInvocationInformationName");

        cdi.addNewGlobalData(attributeInvocationInformation);

        assertThat(cdi.getGlobalData()).containsExactly(attributeInvocationInformation);
    }

    @Test
    void addNewGlobalMethod_addNewElement() {
         MethodInvocationInformation methodInvocationInformation = new MethodInvocationInformation("globalMethodExample", new ArrayList<>(Arrays.asList("String FirstParameter", "Integer SecondParameter")));

        cdi.addNewGlobalMethod(methodInvocationInformation);

        assertThat(cdi.getGlobalMethods()).containsExactly(methodInvocationInformation);
    }

    @Test
    void addNewModule_addNewElement() {
         PackageInvocationInformation packageInvocationInformation = new PackageInvocationInformation("moduleInvocationInformationName");

        cdi.addNewPackage(packageInvocationInformation);

        assertThat(cdi.getPackages()).containsExactly(packageInvocationInformation);
    }
}