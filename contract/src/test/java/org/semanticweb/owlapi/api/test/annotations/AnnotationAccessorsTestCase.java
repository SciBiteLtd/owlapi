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
package org.semanticweb.owlapi.api.test.annotations;

import static org.junit.Assert.assertTrue;
import static org.semanticweb.owlapi.apibinding.OWLFunctionalSyntaxFactory.*;
import static org.semanticweb.owlapi.search.Searcher.find;

import org.junit.Test;
import org.semanticweb.owlapi.api.test.baseclasses.TestBase;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotationAssertionAxiom;
import org.semanticweb.owlapi.model.OWLAnnotationProperty;
import org.semanticweb.owlapi.model.OWLAnnotationValue;
import org.semanticweb.owlapi.model.OWLAnonymousIndividual;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDatatype;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * @author Matthew Horridge, The University of Manchester, Bio-Health Informatics
 *         Group
 * @since 3.1.0
 */
@SuppressWarnings("javadoc")
public class AnnotationAccessorsTestCase extends TestBase {

    private static final IRI SUBJECT = IRI
            .create("http://owlapi.sourceforge.net/ontologies/test#X");

    private OWLAnnotationAssertionAxiom createAnnotationAssertionAxiom() {
        OWLAnnotationProperty prop = AnnotationProperty(getIRI("prop"));
        OWLAnnotationValue value = Literal("value");
        return AnnotationAssertion(prop, SUBJECT, value);
    }

    @Test
    public void testClassAccessor() {
        OWLOntology ont = getOWLOntology("ontology");
        OWLAnnotationAssertionAxiom ax = createAnnotationAssertionAxiom();
        ont.getOWLOntologyManager().addAxiom(ont, ax);
        assertTrue(ont.getAnnotationAssertionAxioms(SUBJECT).contains(ax));
        OWLClass cls = Class(SUBJECT);
        assertTrue(find().in(ont).annotationAxioms(cls).contains(ax));
        assertTrue(find().in(ont).annotations(cls).contains(ax.getAnnotation()));
    }

    @Test
    public void testNamedIndividualAccessor() {
        OWLOntology ont = getOWLOntology("ontology");
        OWLAnnotationAssertionAxiom ax = createAnnotationAssertionAxiom();
        ont.getOWLOntologyManager().addAxiom(ont, ax);
        assertTrue(ont.getAnnotationAssertionAxioms(SUBJECT).contains(ax));
        OWLNamedIndividual cls = NamedIndividual(SUBJECT);
        assertTrue(find().in(ont).annotationAxioms(cls).contains(ax));
        assertTrue(find().in(ont).annotations(cls).contains(ax.getAnnotation()));
    }

    @Test
    public void testObjectPropertyAccessor() {
        OWLOntology ont = getOWLOntology("ontology");
        OWLAnnotationAssertionAxiom ax = createAnnotationAssertionAxiom();
        ont.getOWLOntologyManager().addAxiom(ont, ax);
        assertTrue(ont.getAnnotationAssertionAxioms(SUBJECT).contains(ax));
        OWLObjectProperty cls = ObjectProperty(SUBJECT);
        assertTrue(find().in(ont).annotationAxioms(cls).contains(ax));
        assertTrue(find().in(ont).annotations(cls).contains(ax.getAnnotation()));
    }

    @Test
    public void testDataPropertyAccessor() {
        OWLOntology ont = getOWLOntology("ontology");
        OWLAnnotationAssertionAxiom ax = createAnnotationAssertionAxiom();
        ont.getOWLOntologyManager().addAxiom(ont, ax);
        assertTrue(ont.getAnnotationAssertionAxioms(SUBJECT).contains(ax));
        OWLDataProperty cls = DataProperty(SUBJECT);
        assertTrue(find().in(ont).annotationAxioms(cls).contains(ax));
        assertTrue(find().in(ont).annotations(cls).contains(ax.getAnnotation()));
    }

    @Test
    public void testDatatypeAccessor() {
        OWLOntology ont = getOWLOntology("ontology");
        OWLAnnotationAssertionAxiom ax = createAnnotationAssertionAxiom();
        ont.getOWLOntologyManager().addAxiom(ont, ax);
        assertTrue(ont.getAnnotationAssertionAxioms(SUBJECT).contains(ax));
        OWLDatatype cls = Datatype(SUBJECT);
        assertTrue(find().in(ont).annotationAxioms(cls).asCollection()
                .toString(), find().in(ont).annotationAxioms(cls).contains(ax));
        assertTrue(find().in(ont).annotations(cls).contains(ax.getAnnotation()));
    }

    @Test
    public void testAnonAccessor() {
        OWLOntology ont = getOWLOntology("ontology");
        OWLAnnotationProperty prop = AnnotationProperty(getIRI("prop"));
        OWLAnnotationValue value = Literal("value");
        OWLAnonymousIndividual a = AnonymousIndividual();
        OWLAnnotationAssertionAxiom ax = AnnotationAssertion(prop, a, value);
        ont.getOWLOntologyManager().addAxiom(ont, ax);
        assertTrue(ont.getAnnotationAssertionAxioms(a).contains(ax));
    }
}
