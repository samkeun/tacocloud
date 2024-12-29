<<<<<<< HEAD
package tacos.security;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailsService {

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

=======
package tacos.security;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailsService {

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

>>>>>>> 76055b3 (Add files with Git LFS)
}