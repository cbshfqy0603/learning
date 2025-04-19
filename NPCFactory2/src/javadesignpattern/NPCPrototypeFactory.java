package javadesignpattern;

import java.util.HashMap;
import java.util.Map;

public class NPCPrototypeFactory {
    private static Map<String, NPC> prototypes = new HashMap<>();

    static {
        prototypes.put("Grandfather", new GrandfatherNPC());
        prototypes.put("Gatekeeper", new GatekeeperNPC());
        prototypes.put("Merchant", new MerchantNPC());
        prototypes.put("Wizard", new WizardNPC());
        prototypes.put("Thief", new ThiefNPC());
    }

    public static NPC createNPC(String type) {
        NPC prototype = prototypes.get(type);
        if (prototype != null) {
            return prototype.clone();
        }
        System.out.println("无法找到对应类型的NPC原型！");
        return null;
    }
}

