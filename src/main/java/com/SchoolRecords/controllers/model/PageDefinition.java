package com.SchoolRecords.controllers.model;

import com.SchoolRecords.data.enums.Role;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Getter
public enum PageDefinition
{
    PERSONAL_INFORMATION("Manage your personal information", "/personalDetail", Set.of(Role.ALL)),
    CONTACT_INFORMATION("Manage your contact information", "/contactDetail",Set.of(Role.ALL)),
    COURSE_MANAGEMENT("Manage your courses", "/courses", Set.of(Role.INSTRUCTOR)),
    GRADE_DISPLAY("Display current grades", "/grades", Set.of(Role.STUDENT));

    final String description;
    final String url;
    final Set<Role> roles;

    public static List<PageDefinition> filterPagesByRoles(List<Role> roles)
    {
        return Arrays.stream(PageDefinition.values())
                .filter(pageDefinition -> pageDefinition.roles.contains(Role.ALL) || roles.stream().anyMatch(pageDefinition.roles::contains))
                .toList();
    }

    static List<String> filterPageURLsByRoles(List<Role> roles)
    {
        return filterPagesByRoles(roles).stream().map(PageDefinition::getUrl).toList();
    }

    PageDefinition(String description, String url, Set<Role> roles)
    {
        this.description = description;
        this.url = url;
        this.roles = roles;
    }
}
