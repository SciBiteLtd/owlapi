package org.semanticweb.owlapi.model;

import java.util.Set;

import javax.annotation.Nonnull;

public interface OWLAxiomCollection extends HasAxioms, HasLogicalAxioms,
        HasAxiomsByType, HasContainsAxiom {

    /**
     * @return All of the axioms in this collection. The set that is returned is
     *         a copy.
     */
    @Nonnull
    @Override
    Set<OWLAxiom> getAxioms();

    /**
     * @param includeImportsclosure
     *        if true, the import closure axioms are included.
     * @return All of the axioms in this collection, and optionally in the
     *         import closure. The set that is returned is a copy.
     */
    @Nonnull
    Set<OWLAxiom> getAxioms(boolean includeImportsclosure);

    /**
     * @return The number of axioms in this ontology.
     */
    int getAxiomCount();

    /**
     * @param includeImportsClosure
     *        true if import closure should be included
     * @return The number of axioms in this ontology, and optionally in the
     *         imports closure.
     */
    int getAxiomCount(boolean includeImportsClosure);

    /**
     * Gets all of the axioms in the ontology that affect the logical meaning of
     * the ontology. In other words, this method returns all axioms that are not
     * annotation axioms, or declaration axioms.
     * 
     * @return A set of axioms which are of the type {@code OWLLogicalAxiom} The
     *         set that is returned is a copy of the axioms in the ontology - it
     *         will not be updated if the ontology changes.
     */
    @Nonnull
    @Override
    Set<OWLLogicalAxiom> getLogicalAxioms();

    /**
     * Gets the number of logical axioms in this ontology.
     * 
     * @return The number of axioms in this ontology.
     */
    int getLogicalAxiomCount();

    /**
     * Gets the axioms which are of the specified type.
     * 
     * @param axiomType
     *        The type of axioms to be retrived.
     * @return A set containing the axioms which are of the specified type. The
     *         set that is returned is a copy of the axioms in the ontology - it
     *         will not be updated if the ontology changes.
     * @param <T>
     *        axiom type
     */
    @Nonnull
    @Override
    <T extends OWLAxiom> Set<T> getAxioms(@Nonnull AxiomType<T> axiomType);

    /**
     * Gets the axioms which are of the specified type.
     * 
     * @param axiomType
     *        The type of axioms to be retrived.
     * @param includeImportsClosure
     *        if {@code true} then axioms of the specified type will also be
     *        retrieved from the imports closure of this ontology, if
     *        {@code false} then axioms of the specified type will only be
     *        retrieved from this ontology.
     * @return A set containing the axioms which are of the specified type. The
     *         set that is returned is a copy of the axioms in the ontology (and
     *         its imports closure) - it will not be updated if the ontology
     *         changes.
     * @param <T>
     *        axiom type
     */
    @Nonnull
    <T extends OWLAxiom> Set<T> getAxioms(@Nonnull AxiomType<T> axiomType,
            boolean includeImportsClosure);

    /**
     * Gets the axiom count of a specific type of axiom.
     * 
     * @param axiomType
     *        The type of axiom to count
     * @param <T>
     *        axiom type class
     * @return The number of the specified types of axioms in this ontology
     */
    <T extends OWLAxiom> int getAxiomCount(@Nonnull AxiomType<T> axiomType);

    /**
     * Gets the axiom count of a specific type of axiom, possibly in the imports
     * closure of this ontology.
     * 
     * @param axiomType
     *        The type of axiom to count
     * @param includeImportsClosure
     *        Specifies that the imports closure should be included when
     *        counting axioms
     * @param <T>
     *        axiom type
     * @return The number of the specified types of axioms in this ontology
     */
    <T extends OWLAxiom> int getAxiomCount(@Nonnull AxiomType<T> axiomType,
            boolean includeImportsClosure);

    /**
     * Determines if this ontology contains the specified axiom.
     * 
     * @param axiom
     *        The axiom to test for.
     * @return {@code true} if the ontology contains the specified axioms, or
     *         {@code false} if the ontology doesn't contain the specified
     *         axiom.
     */
    @Override
    boolean containsAxiom(@Nonnull OWLAxiom axiom);

    /**
     * Determines if this ontology, and possibly the imports closure, contains
     * the specified axiom.
     * 
     * @param axiom
     *        The axiom to test for.
     * @param includeImportsClosure
     *        if {@code true} the imports closure of this ontology will be
     *        searched for the specific axiom, if {@code false} just this
     *        ontology will be searched.
     * @return {@code true} if the ontology contains the specified axioms, or
     *         {@code false} if the ontology doesn't contain the specified
     *         axiom.
     */
            boolean
            containsAxiom(@Nonnull OWLAxiom axiom, boolean includeImportsClosure);

    /**
     * Determines if this ontology contains the specified axiom, but ignoring
     * any annotations on this axiom. For example, if the ontology contains
     * {@code SubClassOf(Annotation(p V) A B)} then this method will return
     * {@code true} if the ontology contains {@code SubClassOf(A B)} or
     * {@code SubClassOf(Annotation(q S) A B)} for any annotation property
     * {@code q} and any annotation value {@code S}.
     * 
     * @param axiom
     *        The axiom to test for.
     * @return {@code true} if this ontology contains this axiom with or without
     *         annotations.
     */
    boolean containsAxiomIgnoreAnnotations(@Nonnull OWLAxiom axiom);

    /**
     * Gets the set of axioms contained in this ontology that have the same
     * "logical structure" as the specified axiom.
     * 
     * @param axiom
     *        The axiom that specifies the logical structure of the axioms to
     *        retrieve. If this axiom is annotated then the annotations are
     *        ignored.
     * @return A set of axioms such that for any two axioms, {@code axiomA} and
     *         {@code axiomB} in the set,
     *         {@code axiomA.getAxiomWithoutAnnotations()} is equal to
     *         {@code axiomB.getAxiomWithoutAnnotations()}. The specified axiom
     *         will be contained in the set.
     */
    @Nonnull
    Set<OWLAxiom> getAxiomsIgnoreAnnotations(@Nonnull OWLAxiom axiom);

    /**
     * Gets the set of axioms contained in this ontology that have the same
     * "logical structure" as the specified axiom, possibly searching the
     * imports closure of this ontology.
     * 
     * @param axiom
     *        The axiom that specifies the logical structure of the axioms to
     *        retrieve. If this axiom is annotated then the annotations are
     *        ignored.
     * @param includeImportsClosure
     *        if {@code true} then axioms in the imports closure of this
     *        ontology are returned, if {@code false} only axioms in this
     *        ontology will be returned.
     * @return A set of axioms such that for any two axioms, {@code axiomA} and
     *         {@code axiomB} in the set,
     *         {@code axiomA.getAxiomWithoutAnnotations()} is equal to
     *         {@code axiomB.getAxiomWithoutAnnotations()}. The specified axiom
     *         will be contained in the set.
     */
    @Nonnull
    Set<OWLAxiom> getAxiomsIgnoreAnnotations(@Nonnull OWLAxiom axiom,
            boolean includeImportsClosure);

    /**
     * Determines if this ontology and possibly its imports closure contains the
     * specified axiom but ignoring any annotations on this axiom. For example,
     * if the ontology contains {@code SubClassOf(Annotation(p V) A B)} then
     * this method will return {@code true} if the ontology contains
     * {@code SubClassOf(A B)} or {@code SubClassOf(Annotation(q S) A B)} for
     * any annotation property {@code q} and any annotation value {@code S}.
     * 
     * @param axiom
     *        The axiom to test for.
     * @param includeImportsClosure
     *        if {@code true} the imports closure of this ontology will be
     *        searched for the specified axiom. If {@code false} only this
     *        ontology will be searched for the specifed axiom.
     * @return {@code true} if this ontology contains this axiom with or without
     *         annotations.
     */
    boolean containsAxiomIgnoreAnnotations(@Nonnull OWLAxiom axiom,
            boolean includeImportsClosure);

    /**
     * Gets the axioms where the specified entity appears in the signature of
     * the axiom. The set that is returned, contains all axioms that directly
     * reference the specified entity.
     * 
     * @param owlEntity
     *        The entity that should be directly referred to by an axiom that
     *        appears in the results set.
     * @return The set that is returned is a copy - it will not be updated if
     *         the ontology changes. It is therefore safe to apply changes to
     *         this ontology while iterating over this set.
     */
    @Nonnull
    Set<OWLAxiom> getReferencingAxioms(@Nonnull OWLEntity owlEntity);

    /**
     * Gets the axioms where the specified entity appears in the signature of
     * the axiom. The set that is returned, contains all axioms that directly
     * reference the specified entity.
     * 
     * @param owlEntity
     *        The entity that should be directly referred to by an axiom that
     *        appears in the results set.
     * @param includeImportsClosure
     *        Specifies if the axioms returned should just be from this
     *        ontology, or from the imports closure of this ontology. If
     *        {@code true} the axioms returned will be from the imports closure
     *        of this ontology, if {@code false} the axioms returned will just
     *        be from this ontology.
     * @return The set that is returned is a copy - it will not be updated if
     *         the ontology changes. It is therefore safe to apply changes to
     *         this ontology while iterating over this set.
     */
    @Nonnull
    Set<OWLAxiom> getReferencingAxioms(@Nonnull OWLEntity owlEntity,
            boolean includeImportsClosure);

    /**
     * Gets the axioms that reference the specified anonymous individual.
     * 
     * @param individual
     *        The individual
     * @return The axioms that reference the specified anonymous individual
     */
    @Nonnull
    Set<OWLAxiom> getReferencingAxioms(
            @Nonnull OWLAnonymousIndividual individual);

    // ////////////////////////////////////////////////////////////////////////////////////////////
    //
    // Axioms that form part of a description of a named entity
    //
    // ////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Gets the axioms that form the definition/description of a class.
     * 
     * @param cls
     *        The class whose describing axioms are to be retrieved.
     * @return A set of class axioms that describe the class. This set includes
     *         <ul>
     *         <li>Subclass axioms where the subclass is equal to the specified
     *         class</li>
     *         <li>Equivalent class axioms where the specified class is an
     *         operand in the equivalent class axiom</li>
     *         <li>Disjoint class axioms where the specified class is an operand
     *         in the disjoint class axiom</li>
     *         <li>Disjoint union axioms, where the specified class is the named
     *         class that is equivalent to the disjoint union</li>
     *         </ul>
     *         The set that is returned is a copy - it will not be updated if
     *         the ontology changes. It is therefore safe to apply changes to
     *         this ontology while iterating over this set.
     */
    @Nonnull
    Set<OWLClassAxiom> getAxioms(@Nonnull OWLClass cls);

    /**
     * Gets the axioms that form the definition/description of an object
     * property.
     * 
     * @param prop
     *        The property whose defining axioms are to be retrieved.
     * @return A set of object property axioms that includes
     *         <ul>
     *         <li>Sub-property axioms where the sub property is equal to the
     *         specified property</li>
     *         <li>Equivalent property axioms where the axiom contains the
     *         specified property</li>
     *         <li>Equivalent property axioms that contain the inverse of the
     *         specified property</li>
     *         <li>Disjoint property axioms that contain the specified property</li>
     *         <li>Domain axioms that specify a domain of the specified property
     *         </li>
     *         <li>Range axioms that specify a range of the specified property</li>
     *         <li>Any property characteristic axiom (i.e. Functional,
     *         Symmetric, Reflexive etc.) whose subject is the specified
     *         property</li>
     *         <li>Inverse properties axioms that contain the specified property
     *         </li>
     *         </ul>
     *         The set that is returned is a copy - it will not be updated if
     *         the ontology changes. It is therefore safe to apply changes to
     *         this ontology while iterating over this set.
     */
    @Nonnull
    Set<OWLObjectPropertyAxiom> getAxioms(
            @Nonnull OWLObjectPropertyExpression prop);

    /**
     * Gets the axioms that form the definition/description of a data property.
     * 
     * @param prop
     *        The property whose defining axioms are to be retrieved.
     * @return A set of data property axioms that includes
     *         <ul>
     *         <li>Sub-property axioms where the sub property is equal to the
     *         specified property</li>
     *         <li>Equivalent property axioms where the axiom contains the
     *         specified property</li>
     *         <li>Disjoint property axioms that contain the specified property</li>
     *         <li>Domain axioms that specify a domain of the specified property
     *         </li>
     *         <li>Range axioms that specify a range of the specified property</li>
     *         <li>Any property characteristic axiom (i.e. Functional,
     *         Symmetric, Reflexive etc.) whose subject is the specified
     *         property</li>
     *         </ul>
     *         The set that is returned is a copy - it will not be updated if
     *         the ontology changes. It is therefore safe to apply changes to
     *         this ontology while iterating over this set.
     */
    @Nonnull
    Set<OWLDataPropertyAxiom> getAxioms(@Nonnull OWLDataProperty prop);

    /**
     * Gets the axioms that form the definition/description of an individual.
     * 
     * @param individual
     *        The individual whose defining axioms are to be retrieved.
     * @return A set of individual axioms that includes
     *         <ul>
     *         <li>Individual type assertions that assert the type of the
     *         specified individual</li>
     *         <li>Same individuals axioms that contain the specified individual
     *         </li>
     *         <li>Different individuals axioms that contain the specified
     *         individual</li>
     *         <li>Object property assertion axioms whose subject is the
     *         specified individual</li>
     *         <li>Data property assertion axioms whose subject is the specified
     *         individual</li>
     *         <li>Negative object property assertion axioms whose subject is
     *         the specified individual</li>
     *         <li>Negative data property assertion axioms whose subject is the
     *         specified individual</li>
     *         </ul>
     *         The set that is returned is a copy - it will not be updated if
     *         the ontology changes.
     */
    @Nonnull
    Set<OWLIndividualAxiom> getAxioms(@Nonnull OWLIndividual individual);

    /**
     * Gets the axioms that form the definition/description of an annotation
     * property.
     * 
     * @param property
     *        The property whose definition axioms are to be retrieved
     * @return A set of axioms that includes
     *         <ul>
     *         <li>Annotation subpropertyOf axioms where the specified property
     *         is the sub property</li>
     *         <li>Annotation property domain axioms that specify a domain for
     *         the specified property</li>
     *         <li>Annotation property range axioms that specify a range for the
     *         specified property</li>
     *         </ul>
     */
    @Nonnull
    Set<OWLAnnotationAxiom> getAxioms(@Nonnull OWLAnnotationProperty property);

    /**
     * Gets the datatype definition axioms for the specified datatype.
     * 
     * @param datatype
     *        The datatype
     * @return The set of datatype definition axioms for the specified datatype
     */
    @Nonnull
    Set<OWLDatatypeDefinitionAxiom> getAxioms(@Nonnull OWLDatatype datatype);
}