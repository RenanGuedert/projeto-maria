package br.senai.sc.edu.projetomaria.resource;

public abstract class Messages {

	// Dados do Projeto
	public static final String PROJETO_NOME = ResourceManager.getMessage("projeto.nome"); //$NON-NLS-1$
	public static final String PROJETO_VERSAO = ResourceManager.getMessage("projeto.versao"); //$NON-NLS-1$

	// Banco de Dados
	public static final String BD_ERRO_CONEXAO = ResourceManager.getMessage("bd.erro.conexao"); //$NON-NLS-1$

	// FileSystem
	public static final String FS_ERRO_ACESSO = ResourceManager.getMessage("fs.erro.acesso"); //$NON-NLS-1$

	// Controle de Execução
	public static final String EXEC_ERRO_PARAMETROS = ResourceManager.getMessage("exec.erro.parametros"); //$NON-NLS-1$
	public static final String EXEC_ERRO_FATAL = ResourceManager.getMessage("exec.erro.fatal"); //$NON-NLS-1$
	public static final String EXEC_ABORTADA = ResourceManager.getMessage("exec.abortada"); //$NON-NLS-1$
	public static final String EXEC_ERRO_RECURSO_OBRIGATORIO = ResourceManager.getMessage("exec.erro.recurso.obrigatorio"); //$NON-NLS-1$
	
	// Outras Mensagens
	public static final String ERRO_METODO_NAO_IMPLEMENTADO = ResourceManager.getMessage("erro.metodo.nao.implementado"); //$NON-NLS-1$
	public static final String SUCESSO_RELATORIO_FAMILIA = ResourceManager.getMessage("sucesso.relatorio.familia"); //$NON-NLS-1$
	public static final String ERRO_EXECUCAO_DELETE = ResourceManager.getMessage("erro.falta.informacao"); //$NON-NLS-1$

  public static final String SUCESSO_RELATORIO_CANAL = ResourceManager.getMessage("sucesso.relatorio.canal"); //$NON-NLS-1$

  public static final String SUCESSO_DELETE_CANAL = ResourceManager.getMessage("sucesso.delete.canal"); //$NON-NLS-1$
  public static final String REISTRO_INCLIDO_SUCESSO = ResourceManager.getMessage("registro.incluido.sucesso"); //$NON-NLS-1$
  public static final String REGISTRO = null;
  public static final String REGISTRO_CADASTRO_SUCESSO =  ResourceManager.getMessage("registro.cadastro.sucesso"); //$NON-NLS-1$
  public static final String REGISTRO_ALTERADO_SUCESSO =  ResourceManager.getMessage("registro.alterado.sucesso"); //$NON-NLS-1$
  public static final String REGISTRO_SALVO_SUCESSO =  ResourceManager.getMessage("registro.salvo.sucesso"); //$NON-NLS-1$
  	
  // Historico
	public static final String LEITURA_REALIZADA = ResourceManager.getMessage("leitura.realizada"); //$NON-NLS-1$
	public static final String DADOS_NAO_INSERIDOS = ResourceManager.getMessage("dados.nao.inseridos");//$NON-NLS-1$
	public static final String ARQUIVO_CRIADO_COM_SUCESSO = ResourceManager.getMessage("arquivo.criado.com.sucesso");//$NON-NLS-1$
	public static final String ERRO_ESCRITOR_DE_ARQUIVO = ResourceManager.getMessage("erro.escritor.de.arquivos");//$NON-NLS-1$
	public static final String ERRO_AO_ENVIAR = ResourceManager.getMessage("erro.ao.enviar");//$NON-NLS-1$
	
  	// Produtos
  	public static final String ERRO_VAZIO = ResourceManager.getMessage("erro.vazio"); //$NON-NLS-1$
  	public static final String SUCCESS_PRODUTO = ResourceManager.getMessage("success.produto"); //$NON-NLS-1$
  
  
  public static final String INSERIR_FAMILIA =  ResourceManager.getMessage("inserir.familia"); //$NON-NLS-1$
  public static final String ATUALIZAR_FAMILIA =  ResourceManager.getMessage("atualizar.familia"); //$NON-NLS-1$
  public static final String DELETAR_FAMILIA =  ResourceManager.getMessage("deletar.familia"); //$NON-NLS-1$
  
  public static final String ERRO_CANAL_INSERIR =  ResourceManager.getMessage("erro.canal.inserir"); //$NON-NLS-1$
  public static final String ERRO_CANAL_ATUALIZAR =  ResourceManager.getMessage("erro.canal.atualizar"); //$NON-NLS-1$
  public static final String ERRO_CANAL_DELETAR =  ResourceManager.getMessage("erro.canal.deletar"); //$NON-NLS-1$
  
  public static final String SUCESSO_CANAL_INSERIR =  ResourceManager.getMessage("sucesso.canal.inserir"); //$NON-NLS-1$
  public static final String SUCESSO_CANAL_ATUALIZAR =  ResourceManager.getMessage("sucesso.canal.atualizar"); //$NON-NLS-1$
  public static final String SUCESSO_CANAL_DELETAR =  ResourceManager.getMessage("sucesso.canal.deletar"); //$NON-NLS-1$

  public static final String ERRO_FAMILIA_INSERIR =  ResourceManager.getMessage("erro.familia.inserir"); //$NON-NLS-1$
  public static final String ERRO_FAMILIA_ATUALIZAR =  ResourceManager.getMessage("erro.familia.atualizar"); //$NON-NLS-1$
  public static final String ERRO_FAMILIA_DELETAR =  ResourceManager.getMessage("erro.familia.deletar"); //$NON-NLS-1$
  
  private Messages() {}
	

}
