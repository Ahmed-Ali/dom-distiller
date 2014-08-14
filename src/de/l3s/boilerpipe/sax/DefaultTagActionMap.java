/**
 * boilerpipe
 *
 * Copyright (c) 2009, 2010 Christian Kohlschütter
 *
 * The author licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.l3s.boilerpipe.sax;

import de.l3s.boilerpipe.labels.DefaultLabels;
import de.l3s.boilerpipe.labels.LabelAction;


/**
 * Default {@link TagAction}s. Seem to work well.
 *
 * @see TagActionMap
 */
public class DefaultTagActionMap extends TagActionMap {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public static final TagActionMap INSTANCE = new DefaultTagActionMap();

    protected DefaultTagActionMap() {
        setTagAction("STYLE", CommonTagActions.TA_IGNORABLE_ELEMENT);
        setTagAction("SCRIPT", CommonTagActions.TA_IGNORABLE_ELEMENT);
        setTagAction("OPTION", CommonTagActions.TA_IGNORABLE_ELEMENT);
        setTagAction("OBJECT", CommonTagActions.TA_IGNORABLE_ELEMENT);
        setTagAction("EMBED", CommonTagActions.TA_IGNORABLE_ELEMENT);
        setTagAction("APPLET", CommonTagActions.TA_IGNORABLE_ELEMENT);
        setTagAction("LINK", CommonTagActions.TA_IGNORABLE_ELEMENT);
        setTagAction("NOSCRIPT", CommonTagActions.TA_IGNORABLE_ELEMENT);

        setTagAction("A", CommonTagActions.TA_ANCHOR_TEXT);
        setTagAction("BODY", CommonTagActions.TA_BODY);

		setTagAction("LI", new CommonTagActions.BlockTagLabelAction(
				new LabelAction(DefaultLabels.LI)));
		setTagAction("H1", new CommonTagActions.BlockTagLabelAction(
				new LabelAction(DefaultLabels.H1, DefaultLabels.HEADING)));
		setTagAction("H2", new CommonTagActions.BlockTagLabelAction(
				new LabelAction(DefaultLabels.H2, DefaultLabels.HEADING)));
		setTagAction("H3", new CommonTagActions.BlockTagLabelAction(
				new LabelAction(DefaultLabels.H3, DefaultLabels.HEADING)));
    }
}
