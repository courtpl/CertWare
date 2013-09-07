/**
 * Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.
 * 
 */
package net.certware.sacm.SACM.Argumentation.provider;

import java.util.ArrayList;
import java.util.Collection;

import net.certware.sacm.SACM.Argumentation.util.ArgumentationAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArgumentationItemProviderAdapterFactory extends ArgumentationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2013 United States Government as represented by the Administrator for The National Aeronautics and Space Administration.  All Rights Reserved.\n"; //$NON-NLS-1$

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentationItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(IItemColorProvider.class);
		supportedTypes.add(IItemFontProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.sacm.SACM.Argumentation.Argumentation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentationItemProvider argumentationItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.sacm.SACM.Argumentation.Argumentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArgumentationAdapter() {
		if (argumentationItemProvider == null) {
			argumentationItemProvider = new ArgumentationItemProvider(this);
		}

		return argumentationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.sacm.SACM.Argumentation.CitationElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitationElementItemProvider citationElementItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.sacm.SACM.Argumentation.CitationElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCitationElementAdapter() {
		if (citationElementItemProvider == null) {
			citationElementItemProvider = new CitationElementItemProvider(this);
		}

		return citationElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.sacm.SACM.Argumentation.InformationElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationElementItemProvider informationElementItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.sacm.SACM.Argumentation.InformationElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInformationElementAdapter() {
		if (informationElementItemProvider == null) {
			informationElementItemProvider = new InformationElementItemProvider(this);
		}

		return informationElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.sacm.SACM.Argumentation.ArgumentReasoning} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentReasoningItemProvider argumentReasoningItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.sacm.SACM.Argumentation.ArgumentReasoning}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArgumentReasoningAdapter() {
		if (argumentReasoningItemProvider == null) {
			argumentReasoningItemProvider = new ArgumentReasoningItemProvider(this);
		}

		return argumentReasoningItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.sacm.SACM.Argumentation.Claim} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimItemProvider claimItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.sacm.SACM.Argumentation.Claim}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClaimAdapter() {
		if (claimItemProvider == null) {
			claimItemProvider = new ClaimItemProvider(this);
		}

		return claimItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.sacm.SACM.Argumentation.AssertedInference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertedInferenceItemProvider assertedInferenceItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.sacm.SACM.Argumentation.AssertedInference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssertedInferenceAdapter() {
		if (assertedInferenceItemProvider == null) {
			assertedInferenceItemProvider = new AssertedInferenceItemProvider(this);
		}

		return assertedInferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.sacm.SACM.Argumentation.AssertedEvidence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertedEvidenceItemProvider assertedEvidenceItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.sacm.SACM.Argumentation.AssertedEvidence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssertedEvidenceAdapter() {
		if (assertedEvidenceItemProvider == null) {
			assertedEvidenceItemProvider = new AssertedEvidenceItemProvider(this);
		}

		return assertedEvidenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.sacm.SACM.Argumentation.AssertedContext} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertedContextItemProvider assertedContextItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.sacm.SACM.Argumentation.AssertedContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssertedContextAdapter() {
		if (assertedContextItemProvider == null) {
			assertedContextItemProvider = new AssertedContextItemProvider(this);
		}

		return assertedContextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.sacm.SACM.Argumentation.AssertedChallenge} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertedChallengeItemProvider assertedChallengeItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.sacm.SACM.Argumentation.AssertedChallenge}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssertedChallengeAdapter() {
		if (assertedChallengeItemProvider == null) {
			assertedChallengeItemProvider = new AssertedChallengeItemProvider(this);
		}

		return assertedChallengeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.sacm.SACM.Argumentation.AssertedCounterEvidence} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssertedCounterEvidenceItemProvider assertedCounterEvidenceItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.sacm.SACM.Argumentation.AssertedCounterEvidence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssertedCounterEvidenceAdapter() {
		if (assertedCounterEvidenceItemProvider == null) {
			assertedCounterEvidenceItemProvider = new AssertedCounterEvidenceItemProvider(this);
		}

		return assertedCounterEvidenceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (argumentationItemProvider != null) argumentationItemProvider.dispose();
		if (citationElementItemProvider != null) citationElementItemProvider.dispose();
		if (informationElementItemProvider != null) informationElementItemProvider.dispose();
		if (argumentReasoningItemProvider != null) argumentReasoningItemProvider.dispose();
		if (claimItemProvider != null) claimItemProvider.dispose();
		if (assertedInferenceItemProvider != null) assertedInferenceItemProvider.dispose();
		if (assertedEvidenceItemProvider != null) assertedEvidenceItemProvider.dispose();
		if (assertedContextItemProvider != null) assertedContextItemProvider.dispose();
		if (assertedChallengeItemProvider != null) assertedChallengeItemProvider.dispose();
		if (assertedCounterEvidenceItemProvider != null) assertedCounterEvidenceItemProvider.dispose();
	}

}
