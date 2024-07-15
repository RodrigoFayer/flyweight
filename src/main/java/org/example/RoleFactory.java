package org.example;

import java.util.HashMap;
import java.util.Map;

public class RoleFactory {
    private static Map<String, Role> roles = new HashMap<>();

    public static Role getRole(String role, String squad) {
        Role roleObj = roles.get(role);

        if (roleObj == null) {
            roleObj = new Role(role, squad);
            roles.put(role, roleObj);
        }

        return roleObj;
    }

    public static int getRoleCount() {
        return roles.size();
    }
}
