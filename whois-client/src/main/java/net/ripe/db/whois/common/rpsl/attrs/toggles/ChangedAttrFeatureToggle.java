package net.ripe.db.whois.common.rpsl.attrs.toggles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ChangedAttrFeatureToggle {

    private final Boolean isAvailable;

    @Autowired
    public ChangedAttrFeatureToggle(@Value("${feature.toggle.changed.attr.available}") final Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean isChangedAttrAvailable() {
        return isAvailable;
    }
}
