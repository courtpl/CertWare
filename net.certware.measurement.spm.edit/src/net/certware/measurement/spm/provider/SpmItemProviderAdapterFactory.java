/**
 * Copyright (c) 2011 Kestrel Technology LLC
 */
package net.certware.measurement.spm.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.certware.measurement.smm.BinaryMeasure;
import net.certware.measurement.smm.Category;
import net.certware.measurement.smm.Characteristic;
import net.certware.measurement.smm.CollectiveMeasure;
import net.certware.measurement.smm.Measure;
import net.certware.measurement.smm.Scope;
import net.certware.measurement.smm.SmmElement;
import net.certware.measurement.smm.SmmModel;
import net.certware.measurement.smm.SmmPackage;

import net.certware.measurement.smm.util.SmmSwitch;

import net.certware.measurement.spm.SpmFactory;

import net.certware.measurement.spm.util.SpmAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.command.CommandParameter;

import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
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
public class SpmItemProviderAdapterFactory extends SpmAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public SpmItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
		supportedTypes.add(IItemColorProvider.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.ProjectModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectModelItemProvider projectModelItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.ProjectModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProjectModelAdapter() {
		if (projectModelItemProvider == null) {
			projectModelItemProvider = new ProjectModelItemProvider(this);
		}

		return projectModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.ProjectCommit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectCommitItemProvider projectCommitItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.ProjectCommit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProjectCommitAdapter() {
		if (projectCommitItemProvider == null) {
			projectCommitItemProvider = new ProjectCommitItemProvider(this);
		}

		return projectCommitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.CommitRelationship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommitRelationshipItemProvider commitRelationshipItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.CommitRelationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommitRelationshipAdapter() {
		if (commitRelationshipItemProvider == null) {
			commitRelationshipItemProvider = new CommitRelationshipItemProvider(this);
		}

		return commitRelationshipItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.EndProductQualityCategory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndProductQualityCategoryItemProvider endProductQualityCategoryItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.EndProductQualityCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndProductQualityCategoryAdapter() {
		if (endProductQualityCategoryItemProvider == null) {
			endProductQualityCategoryItemProvider = new EndProductQualityCategoryItemProvider(this);
		}

		return endProductQualityCategoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.InProgressQualityCategory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InProgressQualityCategoryItemProvider inProgressQualityCategoryItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.InProgressQualityCategory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInProgressQualityCategoryAdapter() {
		if (inProgressQualityCategoryItemProvider == null) {
			inProgressQualityCategoryItemProvider = new InProgressQualityCategoryItemProvider(this);
		}

		return inProgressQualityCategoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.EndProductQuality} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndProductQualityItemProvider endProductQualityItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.EndProductQuality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEndProductQualityAdapter() {
		if (endProductQualityItemProvider == null) {
			endProductQualityItemProvider = new EndProductQualityItemProvider(this);
		}

		return endProductQualityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.Maintainability} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaintainabilityItemProvider maintainabilityItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.Maintainability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMaintainabilityAdapter() {
		if (maintainabilityItemProvider == null) {
			maintainabilityItemProvider = new MaintainabilityItemProvider(this);
		}

		return maintainabilityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.InProgressIndicator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InProgressIndicatorItemProvider inProgressIndicatorItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.InProgressIndicator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInProgressIndicatorAdapter() {
		if (inProgressIndicatorItemProvider == null) {
			inProgressIndicatorItemProvider = new InProgressIndicatorItemProvider(this);
		}

		return inProgressIndicatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.ProjectSize} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectSizeItemProvider projectSizeItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.ProjectSize}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProjectSizeAdapter() {
		if (projectSizeItemProvider == null) {
			projectSizeItemProvider = new ProjectSizeItemProvider(this);
		}

		return projectSizeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.CaseDimensionalMeasure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseDimensionalMeasureItemProvider caseDimensionalMeasureItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.CaseDimensionalMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCaseDimensionalMeasureAdapter() {
		if (caseDimensionalMeasureItemProvider == null) {
			caseDimensionalMeasureItemProvider = new CaseDimensionalMeasureItemProvider(this);
		}

		return caseDimensionalMeasureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.ChangeOrderDimensionalMeasure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeOrderDimensionalMeasureItemProvider changeOrderDimensionalMeasureItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.ChangeOrderDimensionalMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChangeOrderDimensionalMeasureAdapter() {
		if (changeOrderDimensionalMeasureItemProvider == null) {
			changeOrderDimensionalMeasureItemProvider = new ChangeOrderDimensionalMeasureItemProvider(this);
		}

		return changeOrderDimensionalMeasureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.TimeDimensionalMeasure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeDimensionalMeasureItemProvider timeDimensionalMeasureItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.TimeDimensionalMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTimeDimensionalMeasureAdapter() {
		if (timeDimensionalMeasureItemProvider == null) {
			timeDimensionalMeasureItemProvider = new TimeDimensionalMeasureItemProvider(this);
		}

		return timeDimensionalMeasureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.AdditiveMeasure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditiveMeasureItemProvider additiveMeasureItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.AdditiveMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdditiveMeasureAdapter() {
		if (additiveMeasureItemProvider == null) {
			additiveMeasureItemProvider = new AdditiveMeasureItemProvider(this);
		}

		return additiveMeasureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.CaseScope} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseScopeItemProvider caseScopeItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.CaseScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCaseScopeAdapter() {
		if (caseScopeItemProvider == null) {
			caseScopeItemProvider = new CaseScopeItemProvider(this);
		}

		return caseScopeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.ProjectScope} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectScopeItemProvider projectScopeItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.ProjectScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProjectScopeAdapter() {
		if (projectScopeItemProvider == null) {
			projectScopeItemProvider = new ProjectScopeItemProvider(this);
		}

		return projectScopeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.ChangeScope} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeScopeItemProvider changeScopeItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.ChangeScope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChangeScopeAdapter() {
		if (changeScopeItemProvider == null) {
			changeScopeItemProvider = new ChangeScopeItemProvider(this);
		}

		return changeScopeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.CriticalDefectChangeOrderCount} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriticalDefectChangeOrderCountItemProvider criticalDefectChangeOrderCountItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.CriticalDefectChangeOrderCount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCriticalDefectChangeOrderCountAdapter() {
		if (criticalDefectChangeOrderCountItemProvider == null) {
			criticalDefectChangeOrderCountItemProvider = new CriticalDefectChangeOrderCountItemProvider(this);
		}

		return criticalDefectChangeOrderCountItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.NormalDefectChangeOrderCount} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalDefectChangeOrderCountItemProvider normalDefectChangeOrderCountItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.NormalDefectChangeOrderCount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNormalDefectChangeOrderCountAdapter() {
		if (normalDefectChangeOrderCountItemProvider == null) {
			normalDefectChangeOrderCountItemProvider = new NormalDefectChangeOrderCountItemProvider(this);
		}

		return normalDefectChangeOrderCountItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.ImprovementChangeOrderCount} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImprovementChangeOrderCountItemProvider improvementChangeOrderCountItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.ImprovementChangeOrderCount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImprovementChangeOrderCountAdapter() {
		if (improvementChangeOrderCountItemProvider == null) {
			improvementChangeOrderCountItemProvider = new ImprovementChangeOrderCountItemProvider(this);
		}

		return improvementChangeOrderCountItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.NewFeatureChangeOrderCount} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewFeatureChangeOrderCountItemProvider newFeatureChangeOrderCountItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.NewFeatureChangeOrderCount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNewFeatureChangeOrderCountAdapter() {
		if (newFeatureChangeOrderCountItemProvider == null) {
			newFeatureChangeOrderCountItemProvider = new NewFeatureChangeOrderCountItemProvider(this);
		}

		return newFeatureChangeOrderCountItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.TrendMeasure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrendMeasureItemProvider trendMeasureItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.TrendMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrendMeasureAdapter() {
		if (trendMeasureItemProvider == null) {
			trendMeasureItemProvider = new TrendMeasureItemProvider(this);
		}

		return trendMeasureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.ScrapRatioMeasure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScrapRatioMeasureItemProvider scrapRatioMeasureItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.ScrapRatioMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScrapRatioMeasureAdapter() {
		if (scrapRatioMeasureItemProvider == null) {
			scrapRatioMeasureItemProvider = new ScrapRatioMeasureItemProvider(this);
		}

		return scrapRatioMeasureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.ModularityMeasure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModularityMeasureItemProvider modularityMeasureItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.ModularityMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModularityMeasureAdapter() {
		if (modularityMeasureItemProvider == null) {
			modularityMeasureItemProvider = new ModularityMeasureItemProvider(this);
		}

		return modularityMeasureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.ReworkRatioMeasure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReworkRatioMeasureItemProvider reworkRatioMeasureItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.ReworkRatioMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReworkRatioMeasureAdapter() {
		if (reworkRatioMeasureItemProvider == null) {
			reworkRatioMeasureItemProvider = new ReworkRatioMeasureItemProvider(this);
		}

		return reworkRatioMeasureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.AdaptabilityRatioMeasure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptabilityRatioMeasureItemProvider adaptabilityRatioMeasureItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.AdaptabilityRatioMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdaptabilityRatioMeasureAdapter() {
		if (adaptabilityRatioMeasureItemProvider == null) {
			adaptabilityRatioMeasureItemProvider = new AdaptabilityRatioMeasureItemProvider(this);
		}

		return adaptabilityRatioMeasureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.MaturityRatioMeasure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaturityRatioMeasureItemProvider maturityRatioMeasureItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.MaturityRatioMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMaturityRatioMeasureAdapter() {
		if (maturityRatioMeasureItemProvider == null) {
			maturityRatioMeasureItemProvider = new MaturityRatioMeasureItemProvider(this);
		}

		return maturityRatioMeasureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.MaintainabilityMeasure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaintainabilityMeasureItemProvider maintainabilityMeasureItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.MaintainabilityMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMaintainabilityMeasureAdapter() {
		if (maintainabilityMeasureItemProvider == null) {
			maintainabilityMeasureItemProvider = new MaintainabilityMeasureItemProvider(this);
		}

		return maintainabilityMeasureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.BrokenCaseSizeMeasure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrokenCaseSizeMeasureItemProvider brokenCaseSizeMeasureItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.BrokenCaseSizeMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBrokenCaseSizeMeasureAdapter() {
		if (brokenCaseSizeMeasureItemProvider == null) {
			brokenCaseSizeMeasureItemProvider = new BrokenCaseSizeMeasureItemProvider(this);
		}

		return brokenCaseSizeMeasureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.FixedCaseSizeMeasure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedCaseSizeMeasureItemProvider fixedCaseSizeMeasureItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.FixedCaseSizeMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFixedCaseSizeMeasureAdapter() {
		if (fixedCaseSizeMeasureItemProvider == null) {
			fixedCaseSizeMeasureItemProvider = new FixedCaseSizeMeasureItemProvider(this);
		}

		return fixedCaseSizeMeasureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.TotalCaseSizeMeasure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TotalCaseSizeMeasureItemProvider totalCaseSizeMeasureItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.TotalCaseSizeMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTotalCaseSizeMeasureAdapter() {
		if (totalCaseSizeMeasureItemProvider == null) {
			totalCaseSizeMeasureItemProvider = new TotalCaseSizeMeasureItemProvider(this);
		}

		return totalCaseSizeMeasureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.BaselineCaseSizeMeasure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaselineCaseSizeMeasureItemProvider baselineCaseSizeMeasureItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.BaselineCaseSizeMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBaselineCaseSizeMeasureAdapter() {
		if (baselineCaseSizeMeasureItemProvider == null) {
			baselineCaseSizeMeasureItemProvider = new BaselineCaseSizeMeasureItemProvider(this);
		}

		return baselineCaseSizeMeasureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.UsageTimeMeasure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageTimeMeasureItemProvider usageTimeMeasureItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.UsageTimeMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUsageTimeMeasureAdapter() {
		if (usageTimeMeasureItemProvider == null) {
			usageTimeMeasureItemProvider = new UsageTimeMeasureItemProvider(this);
		}

		return usageTimeMeasureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.RepairEffortMeasure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepairEffortMeasureItemProvider repairEffortMeasureItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.RepairEffortMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRepairEffortMeasureAdapter() {
		if (repairEffortMeasureItemProvider == null) {
			repairEffortMeasureItemProvider = new RepairEffortMeasureItemProvider(this);
		}

		return repairEffortMeasureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.DevelopmentEffortMeasure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevelopmentEffortMeasureItemProvider developmentEffortMeasureItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.DevelopmentEffortMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDevelopmentEffortMeasureAdapter() {
		if (developmentEffortMeasureItemProvider == null) {
			developmentEffortMeasureItemProvider = new DevelopmentEffortMeasureItemProvider(this);
		}

		return developmentEffortMeasureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.TotalChangeOrderCount} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TotalChangeOrderCountItemProvider totalChangeOrderCountItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.TotalChangeOrderCount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTotalChangeOrderCountAdapter() {
		if (totalChangeOrderCountItemProvider == null) {
			totalChangeOrderCountItemProvider = new TotalChangeOrderCountItemProvider(this);
		}

		return totalChangeOrderCountItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.CriticalAndNormalChangeOrderCount} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CriticalAndNormalChangeOrderCountItemProvider criticalAndNormalChangeOrderCountItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.CriticalAndNormalChangeOrderCount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCriticalAndNormalChangeOrderCountAdapter() {
		if (criticalAndNormalChangeOrderCountItemProvider == null) {
			criticalAndNormalChangeOrderCountItemProvider = new CriticalAndNormalChangeOrderCountItemProvider(this);
		}

		return criticalAndNormalChangeOrderCountItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.ReworkStabilityMeasure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReworkStabilityMeasureItemProvider reworkStabilityMeasureItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.ReworkStabilityMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReworkStabilityMeasureAdapter() {
		if (reworkStabilityMeasureItemProvider == null) {
			reworkStabilityMeasureItemProvider = new ReworkStabilityMeasureItemProvider(this);
		}

		return reworkStabilityMeasureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.ReworkBacklogMeasure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReworkBacklogMeasureItemProvider reworkBacklogMeasureItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.ReworkBacklogMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReworkBacklogMeasureAdapter() {
		if (reworkBacklogMeasureItemProvider == null) {
			reworkBacklogMeasureItemProvider = new ReworkBacklogMeasureItemProvider(this);
		}

		return reworkBacklogMeasureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.ModularityTrend} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModularityTrendItemProvider modularityTrendItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.ModularityTrend}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModularityTrendAdapter() {
		if (modularityTrendItemProvider == null) {
			modularityTrendItemProvider = new ModularityTrendItemProvider(this);
		}

		return modularityTrendItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.AdaptabilityTrend} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdaptabilityTrendItemProvider adaptabilityTrendItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.AdaptabilityTrend}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAdaptabilityTrendAdapter() {
		if (adaptabilityTrendItemProvider == null) {
			adaptabilityTrendItemProvider = new AdaptabilityTrendItemProvider(this);
		}

		return adaptabilityTrendItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.certware.measurement.spm.MaturityTrend} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaturityTrendItemProvider maturityTrendItemProvider;

	/**
	 * This creates an adapter for a {@link net.certware.measurement.spm.MaturityTrend}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMaturityTrendAdapter() {
		if (maturityTrendItemProvider == null) {
			maturityTrendItemProvider = new MaturityTrendItemProvider(this);
		}

		return maturityTrendItemProvider;
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
		if (projectModelItemProvider != null) projectModelItemProvider.dispose();
		if (projectCommitItemProvider != null) projectCommitItemProvider.dispose();
		if (commitRelationshipItemProvider != null) commitRelationshipItemProvider.dispose();
		if (endProductQualityCategoryItemProvider != null) endProductQualityCategoryItemProvider.dispose();
		if (inProgressQualityCategoryItemProvider != null) inProgressQualityCategoryItemProvider.dispose();
		if (endProductQualityItemProvider != null) endProductQualityItemProvider.dispose();
		if (maintainabilityItemProvider != null) maintainabilityItemProvider.dispose();
		if (inProgressIndicatorItemProvider != null) inProgressIndicatorItemProvider.dispose();
		if (projectSizeItemProvider != null) projectSizeItemProvider.dispose();
		if (caseDimensionalMeasureItemProvider != null) caseDimensionalMeasureItemProvider.dispose();
		if (changeOrderDimensionalMeasureItemProvider != null) changeOrderDimensionalMeasureItemProvider.dispose();
		if (timeDimensionalMeasureItemProvider != null) timeDimensionalMeasureItemProvider.dispose();
		if (additiveMeasureItemProvider != null) additiveMeasureItemProvider.dispose();
		if (caseScopeItemProvider != null) caseScopeItemProvider.dispose();
		if (projectScopeItemProvider != null) projectScopeItemProvider.dispose();
		if (changeScopeItemProvider != null) changeScopeItemProvider.dispose();
		if (criticalDefectChangeOrderCountItemProvider != null) criticalDefectChangeOrderCountItemProvider.dispose();
		if (normalDefectChangeOrderCountItemProvider != null) normalDefectChangeOrderCountItemProvider.dispose();
		if (improvementChangeOrderCountItemProvider != null) improvementChangeOrderCountItemProvider.dispose();
		if (newFeatureChangeOrderCountItemProvider != null) newFeatureChangeOrderCountItemProvider.dispose();
		if (trendMeasureItemProvider != null) trendMeasureItemProvider.dispose();
		if (scrapRatioMeasureItemProvider != null) scrapRatioMeasureItemProvider.dispose();
		if (modularityMeasureItemProvider != null) modularityMeasureItemProvider.dispose();
		if (reworkRatioMeasureItemProvider != null) reworkRatioMeasureItemProvider.dispose();
		if (adaptabilityRatioMeasureItemProvider != null) adaptabilityRatioMeasureItemProvider.dispose();
		if (maturityRatioMeasureItemProvider != null) maturityRatioMeasureItemProvider.dispose();
		if (maintainabilityMeasureItemProvider != null) maintainabilityMeasureItemProvider.dispose();
		if (brokenCaseSizeMeasureItemProvider != null) brokenCaseSizeMeasureItemProvider.dispose();
		if (fixedCaseSizeMeasureItemProvider != null) fixedCaseSizeMeasureItemProvider.dispose();
		if (totalCaseSizeMeasureItemProvider != null) totalCaseSizeMeasureItemProvider.dispose();
		if (baselineCaseSizeMeasureItemProvider != null) baselineCaseSizeMeasureItemProvider.dispose();
		if (usageTimeMeasureItemProvider != null) usageTimeMeasureItemProvider.dispose();
		if (repairEffortMeasureItemProvider != null) repairEffortMeasureItemProvider.dispose();
		if (developmentEffortMeasureItemProvider != null) developmentEffortMeasureItemProvider.dispose();
		if (totalChangeOrderCountItemProvider != null) totalChangeOrderCountItemProvider.dispose();
		if (criticalAndNormalChangeOrderCountItemProvider != null) criticalAndNormalChangeOrderCountItemProvider.dispose();
		if (reworkStabilityMeasureItemProvider != null) reworkStabilityMeasureItemProvider.dispose();
		if (reworkBacklogMeasureItemProvider != null) reworkBacklogMeasureItemProvider.dispose();
		if (modularityTrendItemProvider != null) modularityTrendItemProvider.dispose();
		if (adaptabilityTrendItemProvider != null) adaptabilityTrendItemProvider.dispose();
		if (maturityTrendItemProvider != null) maturityTrendItemProvider.dispose();
	}

}
