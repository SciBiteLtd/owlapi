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
package org.semanticweb.owlapi.util.mansyntax;

import java.util.List;
import java.util.Set;

import org.semanticweb.owlapi.expression.OWLEntityChecker;
import org.semanticweb.owlapi.expression.OWLOntologyChecker;
import org.semanticweb.owlapi.formats.ManchesterOWLSyntaxOntologyFormat;
import org.semanticweb.owlapi.io.OWLParserException;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataRange;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLPropertyExpression;
import org.semanticweb.owlapi.model.UnloadableImportException;
import org.semanticweb.owlapi.util.OntologyAxiomPair;

/**
 * Interface for a parser able to parse Manchester OWL Syntax. This covers
 * Protege use of the parser.
 * 
 * @author ignazio
 */
public interface ManchesterOWLSyntaxParser {

    /**
     * Parsing "Inline" Axioms.
     * 
     * @return axiom
     * @throws OWLParserException
     *         parsing error
     */
    OWLAxiom parseAxiom() throws OWLParserException;

    /**
     * Parses an OWL class expression that is represented in Manchester OWL
     * Syntax.
     * 
     * @return The parsed class expression
     * @throws OWLParserException
     *         If a class expression could not be parsed.
     */
    OWLClassExpression parseClassExpression() throws OWLParserException;

    /**
     * @return class frames
     * @throws OWLParserException
     *         parsing error
     */
    Set<OntologyAxiomPair> parseClassFrameEOF() throws OWLParserException;

    /**
     * @param datatype
     *        datatype to use, if one exists in the context. If null, the
     *        datatype will be decided by the literal itself.
     * @return parsed literal
     */
    OWLLiteral parseLiteral(OWLDatatype datatype);

    /**
     * @param owlEntityChecker
     *        owlEntityChecker
     */
    void setOWLEntityChecker(OWLEntityChecker owlEntityChecker);

    /**
     * @param owlOntologyChecker
     *        owlOntologyChecker
     */
    void setOWLOntologyChecker(OWLOntologyChecker owlOntologyChecker);

    /** @return object property chain */
    List<OWLObjectPropertyExpression> parseObjectPropertyChain();

    /**
     * @param ont
     *        ont
     * @return format
     * @throws OWLParserException
     *         parsing error
     * @throws UnloadableImportException
     *         import error
     */
    ManchesterOWLSyntaxOntologyFormat parseOntology(OWLOntology ont)
            throws OWLParserException, UnloadableImportException;

    /** @return list of class expressions */
    Set<OWLClassExpression> parseClassExpressionList();

    /**
     * @return list of object properties
     * @throws OWLParserException
     *         if a parser exception is raised
     */
    Set<OWLObjectPropertyExpression> parseObjectPropertyList()
            throws OWLParserException;

    /** @return data range */
    OWLDataRange parseDataRange();

    /** @return property list (object or data) */
    Set<OWLPropertyExpression> parsePropertyList();

    /** @return list of rule frames */
    List<OntologyAxiomPair> parseRuleFrame();

    /**
     * @return IRI for a SWRL variable
     * @throws OWLParserException
     *         if a parser exception is raised
     */
    IRI parseVariable() throws OWLParserException;
}
