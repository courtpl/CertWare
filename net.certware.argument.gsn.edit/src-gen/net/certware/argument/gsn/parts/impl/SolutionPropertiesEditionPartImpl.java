/**
 * Generated with Acceleo
 */
package net.certware.argument.gsn.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.certware.argument.arm.ArmFactory;
import net.certware.argument.arm.ArmPackage;
import net.certware.argument.arm.ModelElement;
import net.certware.argument.arm.TaggedValue;
import net.certware.argument.gsn.Context;
import net.certware.argument.gsn.Evidence;
import net.certware.argument.gsn.GsnFactory;
import net.certware.argument.gsn.parts.GsnViewsRepository;
import net.certware.argument.gsn.parts.SolutionPropertiesEditionPart;
import net.certware.argument.gsn.providers.GsnMessages;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.api.policies.IPropertiesEditionPolicy;
import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPolicyProvider;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.policies.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.services.PropertiesEditionPolicyProviderService;
import org.eclipse.emf.eef.runtime.impl.utils.EMFListEditUtil;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;



// End of user code	

/**
 * 
 * 
 */
public class SolutionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, SolutionPropertiesEditionPart {

	protected Text identifier;
	protected Text description;
	protected Text content;
	protected EMFListEditUtil isTaggedEditUtil;
	protected ReferencesTable<? extends EObject> isTagged;
	protected List<ViewerFilter> isTaggedBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> isTaggedFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil targetEditUtil;
	protected ReferencesTable<? extends EObject> target;
	protected List<ViewerFilter> targetBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> targetFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil sourceEditUtil;
	protected ReferencesTable<? extends EObject> source;
	protected List<ViewerFilter> sourceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> sourceFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil solutionEvidenceEditUtil;
	protected ReferencesTable<? extends EObject> solutionEvidence;
	protected List<ViewerFilter> solutionEvidenceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> solutionEvidenceFilters = new ArrayList<ViewerFilter>();
	protected EMFListEditUtil solutionContextsEditUtil;
	protected ReferencesTable<? extends EObject> solutionContexts;
	protected List<ViewerFilter> solutionContextsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> solutionContextsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public SolutionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		createPropertiesGroup(view);


		// Start of user code for additional ui definition
		
		// End of user code
	}

	/**
	 * 
	 */
	protected void createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(GsnMessages.SolutionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		createIdentifierText(propertiesGroup);
		createDescriptionText(propertiesGroup);
		createContentText(propertiesGroup);
		createIsTaggedAdvancedTableComposition(propertiesGroup);
		createTargetAdvancedReferencesTable(propertiesGroup);
		createSourceAdvancedReferencesTable(propertiesGroup);
		createSolutionEvidenceAdvancedTableComposition(propertiesGroup);
		createSolutionContextsAdvancedTableComposition(propertiesGroup);
	}

	
	protected void createIdentifierText(Composite parent) {
		SWTUtils.createPartLabel(parent, GsnMessages.SolutionPropertiesEditionPart_IdentifierLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Solution.identifier, GsnViewsRepository.SWT_KIND));
		identifier = new Text(parent, SWT.BORDER);
		GridData identifierData = new GridData(GridData.FILL_HORIZONTAL);
		identifier.setLayoutData(identifierData);
		identifier.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
			}

		});
		identifier.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.identifier, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, identifier.getText()));
				}
			}

		});
		EditingUtils.setID(identifier, GsnViewsRepository.Solution.identifier);
		EditingUtils.setEEFtype(identifier, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Solution.identifier, GsnViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createDescriptionText(Composite parent) {
		SWTUtils.createPartLabel(parent, GsnMessages.SolutionPropertiesEditionPart_DescriptionLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Solution.description, GsnViewsRepository.SWT_KIND));
		description = new Text(parent, SWT.BORDER);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}

		});
		description.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, GsnViewsRepository.Solution.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Solution.description, GsnViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	
	protected void createContentText(Composite parent) {
		SWTUtils.createPartLabel(parent, GsnMessages.SolutionPropertiesEditionPart_ContentLabel, propertiesEditionComponent.isRequired(GsnViewsRepository.Solution.content, GsnViewsRepository.SWT_KIND));
		content = new Text(parent, SWT.BORDER);
		GridData contentData = new GridData(GridData.FILL_HORIZONTAL);
		content.setLayoutData(contentData);
		content.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
			}

		});
		content.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.content, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, content.getText()));
				}
			}

		});
		EditingUtils.setID(content, GsnViewsRepository.Solution.content);
		EditingUtils.setEEFtype(content, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(GsnViewsRepository.Solution.content, GsnViewsRepository.SWT_KIND), null); //$NON-NLS-1$
	}

	/**
	 * @param container
	 * 
	 */
	protected void createIsTaggedAdvancedTableComposition(Composite parent) {
		this.isTagged = new ReferencesTable<TaggedValue>(GsnMessages.SolutionPropertiesEditionPart_IsTaggedLabel, new ReferencesTableListener<TaggedValue>() {			
			public void handleAdd() { addToIsTagged();}
			public void handleEdit(TaggedValue element) { editIsTagged(element); }
			public void handleMove(TaggedValue element, int oldIndex, int newIndex) { moveIsTagged(element, oldIndex, newIndex); }
			public void handleRemove(TaggedValue element) { removeFromIsTagged(element); }
			public void navigateTo(TaggedValue element) { }
		});
		this.isTagged.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Solution.isTagged, GsnViewsRepository.SWT_KIND));
		this.isTagged.createControls(parent);
		GridData isTaggedData = new GridData(GridData.FILL_HORIZONTAL);
		isTaggedData.horizontalSpan = 3;
		this.isTagged.setLayoutData(isTaggedData);
		this.isTagged.setLowerBound(0);
		this.isTagged.setUpperBound(-1);
		isTagged.setID(GsnViewsRepository.Solution.isTagged);
		isTagged.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveIsTagged(TaggedValue element, int oldIndex, int newIndex) {
		EObject editedElement = isTaggedEditUtil.foundCorrespondingEObject(element);
		isTaggedEditUtil.moveElement(element, oldIndex, newIndex);
		isTagged.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToIsTagged() {
		// Start of user code addToIsTagged() method body
				TaggedValue eObject = ArmFactory.eINSTANCE.createTaggedValue();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						isTaggedEditUtil.addElement(propertiesEditionObject);
						isTagged.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.isTagged, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromIsTagged(TaggedValue element) {
		// Start of user code removeFromIsTagged() method body
				EObject editedElement = isTaggedEditUtil.foundCorrespondingEObject(element);
				isTaggedEditUtil.removeElement(element);
				isTagged.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.REMOVE, null, editedElement));
		// End of user code
	}

	/**
	 *  
	 */
	protected void editIsTagged(TaggedValue element) {
		// Start of user code editIsTagged() method body
				EObject editedElement = isTaggedEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider	.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						isTaggedEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						isTagged.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.isTagged, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
		// End of user code
	}

	/**
	 * 
	 */
	protected void createTargetAdvancedReferencesTable(Composite parent) {
		this.target = new ReferencesTable<ModelElement>(GsnMessages.SolutionPropertiesEditionPart_TargetLabel, new ReferencesTableListener<ModelElement>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<ModelElement> dialog = new TabElementTreeSelectionDialog<ModelElement>(resourceSet, targetFilters, targetBusinessFilters,
				"ModelElement", ArmPackage.eINSTANCE.getModelElement(), current.eResource()) {

					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!targetEditUtil.getVirtualList().contains(elem))
								targetEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.target,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						target.refresh();
					}

				};
				dialog.open();
			}
			public void handleEdit(ModelElement element) { editTarget(element); }
			public void handleMove(ModelElement element, int oldIndex, int newIndex) { moveTarget(element, oldIndex, newIndex); }
			public void handleRemove(ModelElement element) { removeFromTarget(element); }
			public void navigateTo(ModelElement element) { }
		});
		this.target.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Solution.target, GsnViewsRepository.SWT_KIND));
		this.target.createControls(parent);
		GridData targetData = new GridData(GridData.FILL_HORIZONTAL);
		targetData.horizontalSpan = 3;
		this.target.setLayoutData(targetData);
		this.target.disableMove();
		target.setID(GsnViewsRepository.Solution.target);
		target.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveTarget(ModelElement element, int oldIndex, int newIndex) {
	}

	/**
	 * 
	 */
	protected void removeFromTarget(ModelElement element) {

		// Start of user code removeFromTarget() method body
				EObject editedElement = targetEditUtil.foundCorrespondingEObject(element);
				targetEditUtil.removeElement(element);
				target.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
				
		// End of user code

	}

	/**
	 * 
	 */
	protected void editTarget(ModelElement element) {

		// Start of user code editTarget() method body
				EObject editedElement = targetEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						targetEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						target.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
				
		// End of user code

	}

	/**
	 * 
	 */
	protected void createSourceAdvancedReferencesTable(Composite parent) {
		this.source = new ReferencesTable<ModelElement>(GsnMessages.SolutionPropertiesEditionPart_SourceLabel, new ReferencesTableListener<ModelElement>() {
			public void handleAdd() {
				TabElementTreeSelectionDialog<ModelElement> dialog = new TabElementTreeSelectionDialog<ModelElement>(resourceSet, sourceFilters, sourceBusinessFilters,
				"ModelElement", ArmPackage.eINSTANCE.getModelElement(), current.eResource()) {

					public void process(IStructuredSelection selection) {
						for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
							EObject elem = (EObject) iter.next();
							if (!sourceEditUtil.getVirtualList().contains(elem))
								sourceEditUtil.addElement(elem);
							propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.source,
								PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
						}
						source.refresh();
					}

				};
				dialog.open();
			}
			public void handleEdit(ModelElement element) { editSource(element); }
			public void handleMove(ModelElement element, int oldIndex, int newIndex) { moveSource(element, oldIndex, newIndex); }
			public void handleRemove(ModelElement element) { removeFromSource(element); }
			public void navigateTo(ModelElement element) { }
		});
		this.source.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Solution.source, GsnViewsRepository.SWT_KIND));
		this.source.createControls(parent);
		GridData sourceData = new GridData(GridData.FILL_HORIZONTAL);
		sourceData.horizontalSpan = 3;
		this.source.setLayoutData(sourceData);
		this.source.disableMove();
		source.setID(GsnViewsRepository.Solution.source);
		source.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
	}

	/**
	 * 
	 */
	protected void moveSource(ModelElement element, int oldIndex, int newIndex) {
	}

	/**
	 * 
	 */
	protected void removeFromSource(ModelElement element) {

		// Start of user code removeFromSource() method body
				EObject editedElement = sourceEditUtil.foundCorrespondingEObject(element);
				sourceEditUtil.removeElement(element);
				source.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
				
		// End of user code

	}

	/**
	 * 
	 */
	protected void editSource(ModelElement element) {

		// Start of user code editSource() method body
				EObject editedElement = sourceEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						sourceEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						source.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
				
		// End of user code

	}

	/**
	 * @param container
	 * 
	 */
	protected void createSolutionEvidenceAdvancedTableComposition(Composite parent) {
		this.solutionEvidence = new ReferencesTable<Evidence>(GsnMessages.SolutionPropertiesEditionPart_SolutionEvidenceLabel, new ReferencesTableListener<Evidence>() {			
			public void handleAdd() { addToSolutionEvidence();}
			public void handleEdit(Evidence element) { editSolutionEvidence(element); }
			public void handleMove(Evidence element, int oldIndex, int newIndex) { moveSolutionEvidence(element, oldIndex, newIndex); }
			public void handleRemove(Evidence element) { removeFromSolutionEvidence(element); }
			public void navigateTo(Evidence element) { }
		});
		this.solutionEvidence.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Solution.solutionEvidence, GsnViewsRepository.SWT_KIND));
		this.solutionEvidence.createControls(parent);
		GridData solutionEvidenceData = new GridData(GridData.FILL_HORIZONTAL);
		solutionEvidenceData.horizontalSpan = 3;
		this.solutionEvidence.setLayoutData(solutionEvidenceData);
		this.solutionEvidence.setLowerBound(0);
		this.solutionEvidence.setUpperBound(-1);
		solutionEvidence.setID(GsnViewsRepository.Solution.solutionEvidence);
		solutionEvidence.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveSolutionEvidence(Evidence element, int oldIndex, int newIndex) {
		EObject editedElement = solutionEvidenceEditUtil.foundCorrespondingEObject(element);
		solutionEvidenceEditUtil.moveElement(element, oldIndex, newIndex);
		solutionEvidence.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.solutionEvidence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToSolutionEvidence() {
		// Start of user code addToSolutionEvidence() method body
				Evidence eObject = GsnFactory.eINSTANCE.createEvidence();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						solutionEvidenceEditUtil.addElement(propertiesEditionObject);
						solutionEvidence.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.solutionEvidence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromSolutionEvidence(Evidence element) {
		// Start of user code removeFromSolutionEvidence() method body
				EObject editedElement = solutionEvidenceEditUtil.foundCorrespondingEObject(element);
				solutionEvidenceEditUtil.removeElement(element);
				solutionEvidence.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.solutionEvidence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
				
		// End of user code
	}

	/**
	 *  
	 */
	protected void editSolutionEvidence(Evidence element) {
		// Start of user code editSolutionEvidence() method body
				EObject editedElement = solutionEvidenceEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						solutionEvidenceEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						solutionEvidence.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.solutionEvidence, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
				
		// End of user code
	}

	/**
	 * @param container
	 * 
	 */
	protected void createSolutionContextsAdvancedTableComposition(Composite parent) {
		this.solutionContexts = new ReferencesTable<Context>(GsnMessages.SolutionPropertiesEditionPart_SolutionContextsLabel, new ReferencesTableListener<Context>() {			
			public void handleAdd() { addToSolutionContexts();}
			public void handleEdit(Context element) { editSolutionContexts(element); }
			public void handleMove(Context element, int oldIndex, int newIndex) { moveSolutionContexts(element, oldIndex, newIndex); }
			public void handleRemove(Context element) { removeFromSolutionContexts(element); }
			public void navigateTo(Context element) { }
		});
		this.solutionContexts.setHelpText(propertiesEditionComponent.getHelpContent(GsnViewsRepository.Solution.solutionContexts, GsnViewsRepository.SWT_KIND));
		this.solutionContexts.createControls(parent);
		GridData solutionContextsData = new GridData(GridData.FILL_HORIZONTAL);
		solutionContextsData.horizontalSpan = 3;
		this.solutionContexts.setLayoutData(solutionContextsData);
		this.solutionContexts.setLowerBound(0);
		this.solutionContexts.setUpperBound(-1);
		solutionContexts.setID(GsnViewsRepository.Solution.solutionContexts);
		solutionContexts.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
	}

	/**
	 *  
	 */
	protected void moveSolutionContexts(Context element, int oldIndex, int newIndex) {
		EObject editedElement = solutionContextsEditUtil.foundCorrespondingEObject(element);
		solutionContextsEditUtil.moveElement(element, oldIndex, newIndex);
		solutionContexts.refresh();
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.solutionContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, editedElement, newIndex));	
	}

	/**
	 *  
	 */
	protected void addToSolutionContexts() {
		// Start of user code addToSolutionContexts() method body
				Context eObject = GsnFactory.eINSTANCE.createContext();
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(eObject);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(eObject);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(propertiesEditionComponent, eObject,resourceSet));
					if (propertiesEditionObject != null) {
						solutionContextsEditUtil.addElement(propertiesEditionObject);
						solutionContexts.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.solutionContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, propertiesEditionObject));
					}
				}
		
		// End of user code
	}

	/**
	 *  
	 */
	protected void removeFromSolutionContexts(Context element) {
		// Start of user code removeFromSolutionContexts() method body
				EObject editedElement = solutionContextsEditUtil.foundCorrespondingEObject(element);
				solutionContextsEditUtil.removeElement(element);
				solutionContexts.refresh();
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.solutionContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, editedElement));
				
		// End of user code
	}

	/**
	 *  
	 */
	protected void editSolutionContexts(Context element) {
		// Start of user code editSolutionContexts() method body
				EObject editedElement = solutionContextsEditUtil.foundCorrespondingEObject(element);
				IPropertiesEditionPolicyProvider policyProvider = PropertiesEditionPolicyProviderService.getInstance().getProvider(element);
				IPropertiesEditionPolicy editionPolicy = policyProvider.getEditionPolicy(editedElement);
				if (editionPolicy != null) {
					EObject propertiesEditionObject = editionPolicy.getPropertiesEditionObject(new EObjectPropertiesEditionContext(null, element,resourceSet));
					if (propertiesEditionObject != null) {
						solutionContextsEditUtil.putElementToRefresh(editedElement, propertiesEditionObject);
						solutionContexts.refresh();
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(SolutionPropertiesEditionPartImpl.this, GsnViewsRepository.Solution.solutionContexts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, editedElement, propertiesEditionObject));
					}
				}
				
		// End of user code
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getIdentifier()
	 * 
	 */
	public String getIdentifier() {
		return identifier.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#setIdentifier(String newValue)
	 * 
	 */
	public void setIdentifier(String newValue) {
		if (newValue != null) {
			identifier.setText(newValue);
		} else {
			identifier.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getContent()
	 * 
	 */
	public String getContent() {
		return content.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#setContent(String newValue)
	 * 
	 */
	public void setContent(String newValue) {
		if (newValue != null) {
			content.setText(newValue);
		} else {
			content.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getIsTaggedToAdd()
	 * 
	 */
	public List getIsTaggedToAdd() {
		return isTaggedEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getIsTaggedToRemove()
	 * 
	 */
	public List getIsTaggedToRemove() {
		return isTaggedEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getIsTaggedToEdit()
	 * 
	 */
	public Map getIsTaggedToEdit() {
		return isTaggedEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getIsTaggedToMove()
	 * 
	 */
	public List getIsTaggedToMove() {
		return isTaggedEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getIsTaggedTable()
	 * 
	 */
	public List getIsTaggedTable() {
		return isTaggedEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#initIsTagged(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initIsTagged(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			isTaggedEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			isTaggedEditUtil = new EMFListEditUtil(current, feature);
		this.isTagged.setInput(isTaggedEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#updateIsTagged(EObject newValue)
	 * 
	 */
	public void updateIsTagged(EObject newValue) {
		if(isTaggedEditUtil != null){
			isTaggedEditUtil.reinit(newValue);
			isTagged.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#addFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIsTagged(ViewerFilter filter) {
		isTaggedFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#addBusinessFilterIsTagged(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIsTagged(ViewerFilter filter) {
		isTaggedBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#isContainedInIsTaggedTable(EObject element)
	 * 
	 */
	public boolean isContainedInIsTaggedTable(EObject element) {
		return isTaggedEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getTargetToAdd()
	 * 
	 */
	public List getTargetToAdd() {
		return targetEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getTargetToRemove()
	 * 
	 */
	public List getTargetToRemove() {
		return targetEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getTargetTable()
	 * 
	 */
	public List getTargetTable() {
		return targetEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#initTarget(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initTarget(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			targetEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			targetEditUtil = new EMFListEditUtil(current, feature);
		this.target.setInput(targetEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#updateTarget(EObject newValue)
	 * 
	 */
	public void updateTarget(EObject newValue) {
		if(targetEditUtil != null){
			targetEditUtil.reinit(newValue);
			target.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#addFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTarget(ViewerFilter filter) {
		targetFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#addBusinessFilterTarget(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTarget(ViewerFilter filter) {
		targetBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#isContainedInTargetTable(EObject element)
	 * 
	 */
	public boolean isContainedInTargetTable(EObject element) {
		return targetEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getSourceToAdd()
	 * 
	 */
	public List getSourceToAdd() {
		return sourceEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getSourceToRemove()
	 * 
	 */
	public List getSourceToRemove() {
		return sourceEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getSourceTable()
	 * 
	 */
	public List getSourceTable() {
		return sourceEditUtil.getVirtualList();
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#initSource(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSource(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			sourceEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			sourceEditUtil = new EMFListEditUtil(current, feature);
		this.source.setInput(sourceEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#updateSource(EObject newValue)
	 * 
	 */
	public void updateSource(EObject newValue) {
		if(sourceEditUtil != null){
			sourceEditUtil.reinit(newValue);
			source.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#addFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSource(ViewerFilter filter) {
		sourceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#addBusinessFilterSource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSource(ViewerFilter filter) {
		sourceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#isContainedInSourceTable(EObject element)
	 * 
	 */
	public boolean isContainedInSourceTable(EObject element) {
		return sourceEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getSolutionEvidenceToAdd()
	 * 
	 */
	public List getSolutionEvidenceToAdd() {
		return solutionEvidenceEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getSolutionEvidenceToRemove()
	 * 
	 */
	public List getSolutionEvidenceToRemove() {
		return solutionEvidenceEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getSolutionEvidenceToEdit()
	 * 
	 */
	public Map getSolutionEvidenceToEdit() {
		return solutionEvidenceEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getSolutionEvidenceToMove()
	 * 
	 */
	public List getSolutionEvidenceToMove() {
		return solutionEvidenceEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getSolutionEvidenceTable()
	 * 
	 */
	public List getSolutionEvidenceTable() {
		return solutionEvidenceEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#initSolutionEvidence(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSolutionEvidence(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			solutionEvidenceEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			solutionEvidenceEditUtil = new EMFListEditUtil(current, feature);
		this.solutionEvidence.setInput(solutionEvidenceEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#updateSolutionEvidence(EObject newValue)
	 * 
	 */
	public void updateSolutionEvidence(EObject newValue) {
		if(solutionEvidenceEditUtil != null){
			solutionEvidenceEditUtil.reinit(newValue);
			solutionEvidence.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#addFilterSolutionEvidence(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSolutionEvidence(ViewerFilter filter) {
		solutionEvidenceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#addBusinessFilterSolutionEvidence(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSolutionEvidence(ViewerFilter filter) {
		solutionEvidenceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#isContainedInSolutionEvidenceTable(EObject element)
	 * 
	 */
	public boolean isContainedInSolutionEvidenceTable(EObject element) {
		return solutionEvidenceEditUtil.contains(element);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getSolutionContextsToAdd()
	 * 
	 */
	public List getSolutionContextsToAdd() {
		return solutionContextsEditUtil.getElementsToAdd();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getSolutionContextsToRemove()
	 * 
	 */
	public List getSolutionContextsToRemove() {
		return solutionContextsEditUtil.getElementsToRemove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getSolutionContextsToEdit()
	 * 
	 */
	public Map getSolutionContextsToEdit() {
		return solutionContextsEditUtil.getElementsToRefresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getSolutionContextsToMove()
	 * 
	 */
	public List getSolutionContextsToMove() {
		return solutionContextsEditUtil.getElementsToMove();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#getSolutionContextsTable()
	 * 
	 */
	public List getSolutionContextsTable() {
		return solutionContextsEditUtil.getVirtualList();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#initSolutionContexts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initSolutionContexts(EObject current, EReference containingFeature, EReference feature) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		if (containingFeature != null)
			solutionContextsEditUtil = new EMFListEditUtil(current, containingFeature, feature);
		else
			solutionContextsEditUtil = new EMFListEditUtil(current, feature);
		this.solutionContexts.setInput(solutionContextsEditUtil.getVirtualList());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#updateSolutionContexts(EObject newValue)
	 * 
	 */
	public void updateSolutionContexts(EObject newValue) {
		if(solutionContextsEditUtil != null){
			solutionContextsEditUtil.reinit(newValue);
			solutionContexts.refresh();
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#addFilterSolutionContexts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSolutionContexts(ViewerFilter filter) {
		solutionContextsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#addBusinessFilterSolutionContexts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSolutionContexts(ViewerFilter filter) {
		solutionContextsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.certware.argument.gsn.parts.SolutionPropertiesEditionPart#isContainedInSolutionContextsTable(EObject element)
	 * 
	 */
	public boolean isContainedInSolutionContextsTable(EObject element) {
		return solutionContextsEditUtil.contains(element);
	}







	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return GsnMessages.Solution_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
