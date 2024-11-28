// Entidade
//abstract class Entidade {
//    // Abstrato = Não está implementado
//    public abstract void mover();
//    public abstract void atacar();
//
//    // Método concreto = Está implementando
//    public void levarDano(int dano) {
//        System.out.println("Levando dano: " + dano);
//    }
//}
interface IEntidade {
    public void mover();
    public void atacar(); // Não são implementados
}

interface IJogadorVip {
    public void ganharBonus();
}

// Jogador
class Jogador implements IEntidade, IJogadorVip {
    @Override
    public void mover() {
        System.out.println("Jogador se movendo...");
    }

    @Override
    public void atacar() {
        System.out.println("Jogador atacando...");
    }

    @Override
    public void ganharBonus() {

    }
}

// Inimigo
class Inimigo implements IEntidade {
    @Override
    public void mover() {
        System.out.println("Inimigo se movendo...");
    }

    @Override
    public void atacar() {
        System.out.println("Inimigo atacando...");
    }
}

// Comunicação = Repository
interface IRepository {
    void getUserByEmail(String email);
    void getUserById(String id);
}

// Regra de negócio = Service, Use Case
interface IService {
    public void registerUser(String email);
}

// Rotas = Controllers
interface IController {
    public void handler();
}

class UserRepository implements IRepository {
    @Override
    public void getUserByEmail(String email) {

    }

    @Override
    public void getUserById(String id) {

    }
}

class UserServices implements IService {
    @Override
    public void registerUser(String email) {

    }
}

// SOLI[D] = Dependency Injection
class UserController implements IController {
    private IService userService;

    public UserController() {
        this.userService = new UserServices();
    }

    @Override
    public void handler() {
        this.userService.registerUser("teste@mail.com");
    }
}

// Main
public class Main {
    public static void main(String[] args) {

    }
}
