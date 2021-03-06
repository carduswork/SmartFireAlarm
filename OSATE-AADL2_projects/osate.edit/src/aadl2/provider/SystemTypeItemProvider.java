/**
 */
package aadl2.provider;


import aadl2.Aadl2Factory;
import aadl2.Aadl2Package;
import aadl2.SystemType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link aadl2.SystemType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemTypeItemProvider extends ComponentTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Aadl2Package.eINSTANCE.getSystemType_OwnedBusAccess());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getSystemType_OwnedDataAccess());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getSystemType_OwnedDataPort());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getSystemType_OwnedSubprogramGroupAccess());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getSystemType_OwnedSubprogramAccess());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getSystemType_OwnedEventPort());
			childrenFeatures.add(Aadl2Package.eINSTANCE.getSystemType_OwnedEventDataPort());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SystemType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SystemType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SystemType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SystemType_type") :
			getString("_UI_SystemType_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SystemType.class)) {
			case Aadl2Package.SYSTEM_TYPE__OWNED_BUS_ACCESS:
			case Aadl2Package.SYSTEM_TYPE__OWNED_DATA_ACCESS:
			case Aadl2Package.SYSTEM_TYPE__OWNED_DATA_PORT:
			case Aadl2Package.SYSTEM_TYPE__OWNED_SUBPROGRAM_GROUP_ACCESS:
			case Aadl2Package.SYSTEM_TYPE__OWNED_SUBPROGRAM_ACCESS:
			case Aadl2Package.SYSTEM_TYPE__OWNED_EVENT_PORT:
			case Aadl2Package.SYSTEM_TYPE__OWNED_EVENT_DATA_PORT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getSystemType_OwnedBusAccess(),
				 Aadl2Factory.eINSTANCE.createBusAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getSystemType_OwnedDataAccess(),
				 Aadl2Factory.eINSTANCE.createDataAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getSystemType_OwnedDataPort(),
				 Aadl2Factory.eINSTANCE.createDataPort()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getSystemType_OwnedSubprogramGroupAccess(),
				 Aadl2Factory.eINSTANCE.createSubprogramGroupAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getSystemType_OwnedSubprogramAccess(),
				 Aadl2Factory.eINSTANCE.createSubprogramAccess()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getSystemType_OwnedEventPort(),
				 Aadl2Factory.eINSTANCE.createEventPort()));

		newChildDescriptors.add
			(createChildParameter
				(Aadl2Package.eINSTANCE.getSystemType_OwnedEventDataPort(),
				 Aadl2Factory.eINSTANCE.createEventDataPort()));
	}

}
