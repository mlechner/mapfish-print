package org.mapfish.print.attribute.map;

import org.mapfish.print.attribute.ReflectiveAttribute;
import org.mapfish.print.config.Configuration;
import org.mapfish.print.config.Template;
import org.mapfish.print.wrapper.PArray;

import java.util.List;

/**
 * The attributes for the {@link org.mapfish.print.processor.map.AddStaticLayersProcessor} which adds the layers in this
 * attribute to the layers in the map.  The typical use is to add the background or overlay layers as the "default"
 * in the config.yaml file if the client desires it can override those values.
 *
 * @author Jesse on 4/18/2015.
 */
public final class StaticLayersAttribute extends ReflectiveAttribute<StaticLayersAttribute.StaticLayersAttributeValue> {

    @Override
    protected Class getValueType() {
        return StaticLayersAttributeValue.class;
    }

    @Override
    public StaticLayersAttributeValue createValue(final Template template) {
        return new StaticLayersAttributeValue();
    }

    @Override
    public void validate(final List<Throwable> validationErrors, final Configuration configuration) {
        // nothing to be done
    }

    /**
     * The object used to parse the input parameters for this attribute object.
     */
    public static final class StaticLayersAttributeValue {
        /**
         * An array of layers (the same as for {@link org.mapfish.print.attribute.map.MapAttribute.MapAttributeValues#layers}).
         *
         * These layers will be added to the map.
         */
        public PArray layers;
    }
}
