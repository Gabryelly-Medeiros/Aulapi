package ifrn.pi.eventos.controllers;
import ifrn.pi.eventos.models.Evento;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventosController {

	@RequestMapping("/eventos/form")
	public String form(Model model) {
		return "formEvento";
	}

	@PostMapping("/eventos/salvar")
	public String salvar(@ModelAttribute Evento evento, Model model) {
		System.out.println("Evento salvo com os seguintes dados:");
		System.out.println("Nome: " + evento.getNome());
		System.out.println("Local: " + evento.getLocal());
		System.out.println("Data: " + evento.getData());
		System.out.println("Horário: " + evento.getHorario());

		model.addAttribute("mensagem", "Evento salvo com sucesso!");

		return "formEvento";
	}
}
