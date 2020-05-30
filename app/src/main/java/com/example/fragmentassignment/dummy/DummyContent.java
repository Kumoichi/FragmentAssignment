
package com.example.fragmentassignment.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();


    static{
        addItem(new DummyItem("1","Calgary", "Calgary sits in the sunny eastern foothills of Canada's" +
                " Rocky Mountains, where the Bow and Elbow rivers meet. It is the major urban centre for the entire southern " +
                "half of the province of Alberta, and is surrounded by an area of profound beauty with an unspoiled, resource-rich " +
                "natural environment."));

        addItem(new DummyItem("2","Victoria", "Victoria is located on the southern most tip of Vancouver Island " +
                "making it the most southernly city on the west coast of Canada.. The City's climate is also the most temperate " +
                "in Canada and it boasts gardens that bloom year-round."));

        addItem(new DummyItem("3","Vancouver", "he City of Vancouver is a coastal, seaport city on the mainland of" +
                " British Columbia. Located on the western half of the Burrard Peninsula, Vancouver is bounded to the north by English Bay" +
                " and the Burrard Inlet and to the south by the Fraser River."));

        addItem(new DummyItem("4","Toronto", " Toronto is Canada's largest city and a world leader in such areas " +
                "as business, finance, technology, entertainment and culture. Its large population of immigrants from all over the globe " +
                "has also made Toronto one of the most multicultural cities in the world."));

        addItem(new DummyItem("5","Kamloops", "Situated at the junction of the North and South Thompson Rivers " +
                "in the Thompson Valley, Kamloops is the second largest city in the BC Interior with a growing population of 90,000 people."));
    }


    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String detail;


        public DummyItem(String id, String content, String detail) {
            this.id = id;
            this.content = content;
            this.detail = detail;

        }

        @Override
        public String toString() {
            return content;
        }
    }
}



