/*
 * ice4j, the OpenSource Java Solution for NAT and Firewall Traversal.
 * Maintained by the SIP Communicator community (http://sip-communicator.org).
 *
 * Distributable under LGPL license. See terms of license at gnu.org.
 */
package org.ice4j.attribute;

/**
 * An {@link org.ice4j.attribute.IceControlAttribute} implementation representing the
 * ICE-CONTROLLED ICE {@link org.ice4j.attribute.Attribute}s.
 */
public final class IceControlledAttribute
    extends IceControlAttribute
{
    /**
     * Constructs an ICE-CONTROLLING attribute.
     */
    public IceControlledAttribute()
    {
        super(false);
    }
}
