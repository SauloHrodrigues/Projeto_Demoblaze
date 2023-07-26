#language: pt
Funcionalidade: Apresentação do vídeo e mensagem de texto;
    
    Contexto: 
    	Dado estar no site 'https://www.demoblaze.com'
    
   @0005  
  Cenario: Validar apresentação do vídeo na seção sobre a empresa
    Quando clicar no link 'About us'  
    Então validar elemento do video institucional da empresa
 
   @0006 
  Cenario: Validar mensagem de texto na seção contato
    Quando clicar no link 'Contact'  
    E preencher e-mail 'Contact Email:'
    E preencher nome 'Contact Name:'
    E preencher uma mensagem
    E clicar 'Send mensage'
    Então validar frase "Thanks for the message!!"