package com.qcadoo.mes.core.data.view;

import java.util.Set;

public interface RootComponent extends ContainerComponent {

    void initialize();

    Set<String> lookupListeners(final String path);

    CastableComponent<?> lookupComponent(final String path);

}