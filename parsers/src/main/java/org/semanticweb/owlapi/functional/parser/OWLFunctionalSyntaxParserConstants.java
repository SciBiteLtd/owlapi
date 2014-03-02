/* This file is part of the OWL API.
 * The contents of this file are subject to the LGPL License, Version 3.0.
 * Copyright 2014, The University of Manchester
 * 
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 * Alternatively, the contents of this file may be used under the terms of the Apache License, Version 2.0 in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */
/* Generated By:JavaCC: Do not edit this line. OWLFunctionalSyntaxParserConstants.java */
package org.semanticweb.owlapi.functional.parser;

/**
 * Token literal values and constants. Generated by
 * org.javacc.parser.OtherFilesGen#start()
 */
@SuppressWarnings("javadoc")
public interface OWLFunctionalSyntaxParserConstants {

    /** End of File. */
    int EOF = 0;
    int COMMENT_START = 5;
    int STRINGLITERAL_START = 8;
    int ANY_ESCAPED_CHAR = 9;
    int ANY_CHAR = 10;
    int STRINGLITERAL = 11;
    int OPENPAR = 12;
    int CLOSEPAR = 13;
    int ONTOLOGY = 14;
    int LABEL = 15;
    int IMPORT = 16;
    int COMMENT = 17;
    int SUBCLASSOF = 18;
    int LANGIDENTIFIER = 19;
    int DATATYPEIDENTIFIER = 20;
    int EQUIVALENTCLASSES = 21;
    int DISJOINTCLASSES = 22;
    int DISJOINTUNION = 23;
    int ANNOTATION = 24;
    int ANNOTATIONPROPERTY = 25;
    int ANNOTATIONASSERTION = 26;
    int SUBANNOTATIONPROPERTYOF = 27;
    int ANNOTATIONPROPERTYDOMAIN = 28;
    int ANNOTATIONPROPERTYRANGE = 29;
    int HASKEY = 30;
    int DECLARATION = 31;
    int DOCUMENTATION = 32;
    int CLASS = 33;
    int OBJECTPROP = 34;
    int DATAPROP = 35;
    int NAMEDINDIVIDUAL = 36;
    int DATATYPE = 37;
    int DATAONEOF = 38;
    int DATAUNIONOF = 39;
    int DATAINTERSECTIONOF = 40;
    int OBJECTONEOF = 41;
    int OBJECTUNIONOF = 42;
    int OBJECTHASVALUE = 43;
    int OBJECTINVERSEOF = 44;
    int INVERSEOBJECTPROPERTIES = 45;
    int DATACOMPLEMENTOF = 46;
    int DATATYPERESTRICTION = 47;
    int DATATYPEDEFINITION = 48;
    int OBJECTINTERSECTIONOF = 49;
    int OBJECTCOMPLEMENTOF = 50;
    int OBJECTALLVALUESFROM = 51;
    int OBJECTSOMEVALUESFROM = 52;
    int OBJECTHASSELF = 53;
    int OBJECTMINCARDINALITY = 54;
    int OBJECTMAXCARDINALITY = 55;
    int OBJECTEXACTCARDINALITY = 56;
    int DATAALLVALUESFROM = 57;
    int DATASOMEVALUESFROM = 58;
    int DATAHASVALUE = 59;
    int DATAMINCARDINALITY = 60;
    int DATAMAXCARDINALITY = 61;
    int DATAEXACTCARDINALITY = 62;
    int SUBOBJECTPROPERTYCHAIN = 63;
    int SUBOBJECTPROPERTYOF = 64;
    int EQUIVALENTOBJECTPROPERTIES = 65;
    int DISJOINTOBJECTPROPERTIES = 66;
    int OBJECTPROPERTYDOMAIN = 67;
    int OBJECTPROPERTYRANGE = 68;
    int FUNCTIONALOBJECTPROPERTY = 69;
    int INVERSEFUNCTIONALOBJECTPROPERTY = 70;
    int REFLEXIVEOBJECTPROPERTY = 71;
    int IRREFLEXIVEOBJECTPROPERTY = 72;
    int SYMMETRICOBJECTPROPERTY = 73;
    int ASYMMETRICOBJECTPROPERTY = 74;
    int TRANSITIVEOBJECTPROPERTY = 75;
    int SUBDATAPROPERTYOF = 76;
    int EQUIVALENTDATAPROPERTIES = 77;
    int DISJOINTDATAPROPERTIES = 78;
    int DATAPROPERTYDOMAIN = 79;
    int DATAPROPERTYRANGE = 80;
    int FUNCTIONALDATAPROPERTY = 81;
    int SAMEINDIVIDUAL = 82;
    int DIFFERENTINDIVIDUALS = 83;
    int CLASSASSERTION = 84;
    int OBJECTPROPERTYASSERTION = 85;
    int NEGATIVEOBJECTPROPERTYASSERTION = 86;
    int DATAPROPERTYASSERTION = 87;
    int NEGATIVEDATAPROPERTYASSERTION = 88;
    int PREFIX = 89;
    int LENGTH = 90;
    int MINLENGTH = 91;
    int MAXLENGTH = 92;
    int PATTERN = 93;
    int MININCLUSIVE = 94;
    int MAXINCLUSIVE = 95;
    int MINEXCLUSIVE = 96;
    int MAXEXCLUSIVE = 97;
    int TOTALDIGITS = 98;
    int FRACTIONDIGITS = 99;
    int DLSAFERULE = 100;
    int BODY = 101;
    int HEAD = 102;
    int CLASSATOM = 103;
    int DATARANGEATOM = 104;
    int OBJECTPROPERTYATOM = 105;
    int DATAPROPERTYATOM = 106;
    int BUILTINATOM = 107;
    int SAMEINDIVIDUALATOM = 108;
    int DIFFERENTINDIVIDUALSATOM = 109;
    int VARIABLE = 110;
    int DGRULE = 111;
    int DESCRIPTIONGRAPH = 112;
    int NODES = 113;
    int NODEASSERTION = 114;
    int EDGES = 115;
    int EDGEASSERTION = 116;
    int MAINCLASSES = 117;
    int EQUALS = 118;
    int INT = 119;
    int FULLIRI = 120;
    int PNAME_NS = 121;
    int PN_LOCAL = 122;
    int PNAME_LN = 123;
    int PN_PREFIX = 124;
    int PN_CHARS_BASE = 125;
    int PN_CHARS = 126;
    int PN_CHARS_U = 127;
    int NODEID = 128;
    int ERROR = 129;
    /** Lexical state. */
    int DEFAULT = 0;
    /** Lexical state. */
    int IN_COMMENT = 1;
    /** Lexical state. */
    int IN_STRING_LITERAL = 2;
    /** Literal token values. */
    String[] tokenImage = { "<EOF>", "\" \"", "\"\\n\"", "\"\\t\"", "\"\\r\"",
            "<COMMENT_START>", "<token of kind 6>", "\"\\n\"", "\"\\\"\"",
            "<ANY_ESCAPED_CHAR>", "<ANY_CHAR>", "\"\\\"\"", "\"(\"", "\")\"",
            "\"Ontology\"", "\"Label\"", "\"Import\"", "\"Comment\"",
            "\"SubClassOf\"", "\"@\"", "\"^^\"", "\"EquivalentClasses\"",
            "\"DisjointClasses\"", "\"DisjointUnion\"", "\"Annotation\"",
            "\"AnnotationProperty\"", "\"AnnotationAssertion\"",
            "\"SubAnnotationPropertyOf\"", "\"AnnotationPropertyDomain\"",
            "\"AnnotationPropertyRange\"", "\"HasKey\"", "\"Declaration\"",
            "\"Documentation\"", "\"Class\"", "\"ObjectProperty\"",
            "\"DataProperty\"", "\"NamedIndividual\"", "\"Datatype\"",
            "\"DataOneOf\"", "\"DataUnionOf\"", "\"DataIntersectionOf\"",
            "\"ObjectOneOf\"", "\"ObjectUnionOf\"", "\"ObjectHasValue\"",
            "\"ObjectInverseOf\"", "\"InverseObjectProperties\"",
            "\"DataComplementOf\"", "\"DatatypeRestriction\"",
            "\"DatatypeDefinition\"", "\"ObjectIntersectionOf\"",
            "\"ObjectComplementOf\"", "\"ObjectAllValuesFrom\"",
            "\"ObjectSomeValuesFrom\"", "\"ObjectHasSelf\"",
            "\"ObjectMinCardinality\"", "\"ObjectMaxCardinality\"",
            "\"ObjectExactCardinality\"", "\"DataAllValuesFrom\"",
            "\"DataSomeValuesFrom\"", "\"DataHasValue\"",
            "\"DataMinCardinality\"", "\"DataMaxCardinality\"",
            "\"DataExactCardinality\"", "\"ObjectPropertyChain\"",
            "\"SubObjectPropertyOf\"", "\"EquivalentObjectProperties\"",
            "\"DisjointObjectProperties\"", "\"ObjectPropertyDomain\"",
            "\"ObjectPropertyRange\"", "\"FunctionalObjectProperty\"",
            "\"InverseFunctionalObjectProperty\"",
            "\"ReflexiveObjectProperty\"", "\"IrreflexiveObjectProperty\"",
            "\"SymmetricObjectProperty\"", "\"AsymmetricObjectProperty\"",
            "\"TransitiveObjectProperty\"", "\"SubDataPropertyOf\"",
            "\"EquivalentDataProperties\"", "\"DisjointDataProperties\"",
            "\"DataPropertyDomain\"", "\"DataPropertyRange\"",
            "\"FunctionalDataProperty\"", "\"SameIndividual\"",
            "\"DifferentIndividuals\"", "\"ClassAssertion\"",
            "\"ObjectPropertyAssertion\"",
            "\"NegativeObjectPropertyAssertion\"", "\"DataPropertyAssertion\"",
            "\"NegativeDataPropertyAssertion\"", "\"Prefix\"", "\"length\"",
            "\"minLength\"", "\"maxLength\"", "\"pattern\"",
            "\"minInclusive\"", "\"maxInclusive\"", "\"minExclusive\"",
            "\"maxExclusive\"", "\"totalDigits\"", "\"fractionDigits\"",
            "\"DLSafeRule\"", "\"Body\"", "\"Head\"", "\"ClassAtom\"",
            "\"DataRangeAtom\"", "\"ObjectPropertyAtom\"",
            "\"DataPropertyAtom\"", "\"BuiltInAtom\"",
            "\"SameIndividualAtom\"", "\"DifferentIndividualsAtom\"",
            "\"Variable\"", "\"DescriptionGraphRule\"", "\"DescriptionGraph\"",
            "\"Nodes\"", "\"NodeAssertion\"", "\"Edges\"", "\"EdgeAssertion\"",
            "\"MainClasses\"", "\"=\"", "<INT>", "<FULLIRI>", "<PNAME_NS>",
            "<PN_LOCAL>", "<PNAME_LN>", "<PN_PREFIX>", "<PN_CHARS_BASE>",
            "<PN_CHARS>", "<PN_CHARS_U>", "<NODEID>", "<ERROR>", };
}
