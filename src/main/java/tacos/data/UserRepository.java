<<<<<<< HEAD
package tacos.data;
import org.springframework.data.repository.CrudRepository;
import tacos.User;

public interface UserRepository extends CrudRepository<User, String> {

    User findByUsername(String username);

=======
package tacos.data;
import org.springframework.data.repository.CrudRepository;
import tacos.User;

public interface UserRepository extends CrudRepository<User, String> {

    User findByUsername(String username);

>>>>>>> 76055b3 (Add files with Git LFS)
}