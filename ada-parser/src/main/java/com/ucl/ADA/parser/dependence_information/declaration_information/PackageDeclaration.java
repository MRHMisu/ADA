package com.ucl.ADA.parser.dependence_information.declaration_information;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class PackageDeclaration extends ElementDeclaration {
    /**
     * The constructor of the package declaration object. I.e.
     * "com.ucl.ADA.parser.dependence_information.declaration_information"
     * @param packageName the name of the package being constructed
     */
    public PackageDeclaration(String packageName) {
        super(packageName);
    }
}