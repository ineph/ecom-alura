package local.alua;


import java.util.UUID;
import java.util.concurrent.ExecutionException;

public class NewOrderMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        try (var dispatcher = new KafkaDispatcher()) {

            for (var i = 0; i < 10; i++) {
                var key = UUID.randomUUID().toString();
                var value = key + "MENSAGEM DE NOVA COMPRA!";
                dispatcher.send("ECOMMERCE_NEW_ORDER", key, value);

                var email = "Estamos processando sua compraaa";
                dispatcher.send("ECOMMERCE_SEND_EMAIL", key, email);
            }
        }
    }
}
