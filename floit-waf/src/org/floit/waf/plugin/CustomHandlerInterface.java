/**
 *
 *
 * Project: GUI Test Framework
 * Author: $Author: kieran $
 * Created: $Date: 2010/06/28 12:38:53 $
 * Revision: $Revision: 1.3 $
 */
package org.floit.waf.plugin;

import org.floit.waf.config.Input;
import org.floit.waf.navigator.TestServerApi;

/**
 * Interface which enables the use of special Input handlers / plug-ins.
 * <p>
 * If the <code>Input</code> doesn't fit into any of the standard types handled
 * by <code>InputHandler</code>, then it is passed to a custom handler class,
 * which must implement this interface.
 * </p>
 */

public interface CustomHandlerInterface {

    /**
     * This is the method which will take the Input and perform any necessary
     * actions with it.
     *
     * <p>
     * <b>Example:</b>
     * </p>
     * <p>
     * handleInput (Input input) { server.click(input.getID()); }
     * </p>
     *
     * @param input
     *            The Input instance to be used.
     * @throws Exception 
     */
    void handleInput(Input input) throws Exception;

    /**
     * This method provides access to the test server runtime so it can be used
     * with the Input.
     *
     * @param server
     *            the GUI test server instance.
     */
    void setServer(TestServerApi server);
}
