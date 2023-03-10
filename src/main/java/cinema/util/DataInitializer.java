package cinema.util;

import cinema.model.Role;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private RoleService roleService;
    private UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.USER);
        roleService.add(userRole);
        
        User admin = new User();
        admin.setEmail("admin@gmail.com");
        admin.setPassword("admin12345");
        admin.setRoles(Set.of(adminRole));
        userService.add(admin);
        
        User user = new User();
        user.setEmail("user@gmail.com");
        user.setPassword("user12345");
        user.setRoles(Set.of(userRole));
        userService.add(user);
    }
}
