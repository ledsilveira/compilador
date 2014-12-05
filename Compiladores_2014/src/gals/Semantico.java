package gals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import simbolos.Simbolo;
import simbolos.TabelaDeSimbolos;

public class Semantico implements Constants
{
    TabelaDeSimbolos ts;
    Boolean Le_VAR;
    Boolean eh_registro;
    int nivel_atual;
    int deslocamento;
    int POSID;
    String contextoLID;
    String CategoriaAtual;  
    ArrayList <Integer>ListaReg;
    ArrayList <Integer>ListaVar;
    ArrayList <Integer>ListaAux;
    protected int NPF;
    String TipoAtual;
    private Object TipoConst;
    
    public  Semantico()
    {
        this.TipoAtual = "";
        this.POSID = -1;
        this.CategoriaAtual = "";
        this.contextoLID = "";
        this.ts = new TabelaDeSimbolos();
        this.ListaReg = new ArrayList<>();
        this.ListaVar = new ArrayList<>();
        this.ListaAux = new ArrayList<>();
         
        
    }
    public void executeAction(int action, Token token)	throws SemanticError
    {
        System.out.println("Ação #"+action+", Token: "+token);
        switch( action )
        {
            case 101:
                this.metodo101( token );
                break;
            case 102:
                this.metodo102( token );
                break;
            case 103:
                this.metodo103( token );
                break;
            case 104:
                this.metodo104( token );
                break;
            case 105:
                this.metodo105( token );
                break;
            case 106:
                this.metodo106( token );
                break;
            case 107:
                this.metodo107( token );
                break;
            case 108:
                this.metodo108( token );
                break;
            case 109:
                this.metodo109( token );
                break;
            case 110:
                this.metodo110( token );
                break;
            case 111:
                this.metodo111( token );
                break;
            case 112:
                this.metodo112( token );
                break;
            case 113:
                this.metodo113( token );
                break;
            case 114:
                this.metodo114( token );
                break;
            case 115:
                this.metodo115( token );
                break;
            case 116:
                this.metodo116( token );
                break;
            case 117:
                this.metodo117( token );
                break;
            case 118:
                this.metodo118( token );
                break;
            case 119:
                this.metodo119( token );
                break;
            case 120:
                this.metodo120( token );
                break;
            case 121:
                this.metodo121( token );
                break;
            case 122:
                this.metodo122( token );
                break;
            case 123:
                this.metodo123( token );
                break;
            case 124:
                this.metodo124( token );
                break;
            case 125:
                this.metodo125( token );
                break;
            case 126:
                this.metodo126( token );
                break;
            case 127:
                this.metodo127( token );
                break;
            case 128:
                this.metodo128( token );
                break;
            case 129:
                this.metodo109( token );
                break;
            case 130:
                this.metodo130( token );
                break;
            case 131:
                this.metodo131( token );
                break;
            case 132:
                this.metodo132( token );
                break;
            case 133:
                this.metodo133( token );
                break;
            case 134:
                this.metodo134( token );
                break;
            case 135:
                this.metodo135( token );
                break;
            case 136:
                this.metodo136( token );
                break;
            case 137:
                this.metodo137( token );
                break;
            case 138:
                this.metodo138( token );
                break;
            case 139:
                this.metodo139( token );
                break;
            case 140:
                this.metodo140( token );
                break;
            case 141:
                this.metodo141( token );
                break;
            case 142:
                this.metodo142( token );
                break;
            case 143:
                this.metodo143( token );
                break;
            case 144:
                this.metodo144( token );
                break;
            case 145:
                this.metodo145( token );
                break;
            case 146:
                this.metodo146( token );
                break;
            case 147:
                this.metodo147( token );
                break;
            case 148:
                this.metodo148( token );
                break;
            case 149:
                this.metodo149( token );
                break;
            case 150:
                this.metodo150( token );
                break;
            case 151:
                this.metodo151( token );
                break;
            case 152:
                this.metodo152( token );
                break;
            case 153:
                this.metodo153( token );
                break;
            case 154:
                this.metodo154( token );
                break;
            case 155:
                this.metodo155( token );
                break;
            case 156:
                this.metodo156( token );
                break;
            case 157:
                this.metodo157( token );
                break;
            case 158:
                this.metodo158( token );
                break;
            case 159:
                this.metodo159( token );
                break;
            case 160:
                this.metodo160( token );
                break;
            case 161:
                this.metodo161( token );
                break;
            case 162:
                this.metodo162( token );
                break;
            case 163:
                this.metodo163( token );
                break;
            case 164:
                this.metodo164( token );
                break;
            case 165:
                this.metodo165( token );
                break;
            case 166:
                this.metodo166( token );
                break;
            case 167:
                this.metodo167( token );
                break;
            case 168:
                this.metodo168( token );
                break;
            case 169:
                this.metodo169( token );
                break;
            case 170:
                this.metodo170( token );
                break;
            case 171:
                this.metodo171( token );
                break;
            case 172:
                this.metodo172( token );
                break;
            case 173:
                this.metodo173( token );
                break;
            case 174:
                this.metodo174( token );
                break;
            case 175:
                this.metodo175( token );
                break;
            case 176:
                this.metodo176( token );
                break;
            case 177:
                this.metodo177( token );
                break;
            case 178:
                this.metodo178( token );
                break;
            case 179:
                this.metodo179( token );
                break;

        }
    }	

    private void metodo101(Token token) throws SemanticError {
        //instancia simbolo    
        Simbolo s = new Simbolo( token.getLexeme(),"ID-PROGRAMA" );
        s.setNivelAtual(0);
        s.setDeslocamento(0);
        //grava nivel atual da tabela de símbolos
        ts.setaNivelAtual(0);
        ts.adicionaSimbolo(s);
        //instancia valores
        this.eh_registro = false;
        this.Le_VAR = false;
        
        //throw new SemanticError("Not supported yet.", token.getPosition() ); //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo102(Token token) throws SemanticError {
        if ( this.ts.verificaIdDeclarado(token) )
        {
            throw new SemanticError("ID já declarado.", token.getPosition() );
        }
        Simbolo s = new Simbolo( token.getLexeme(),"ID-CONST" );
        s.setNivelAtual(0);
        this.ts.adicionaSimbolo(s);
        int posSimboloAtual = this.ts.getQuantiTotalElements()-1;
        this.POSID = posSimboloAtual;
    }

    private void metodo103(Token token) throws SemanticError {
        
        //throw new SemanticError("Not supported yet." , 1); //To change body of generated methods, choose Tools | Templates.
    }
    private void metodo104(Token token) throws SemanticError {
        this.contextoLID = "decl";
        if ( this.eh_registro )
        {
            this.CategoriaAtual = "ID-CAMPO-DE-REGISTRO";
        }
        else
        {
            this.CategoriaAtual = "ID-VARIAVEL";
        }
    }
    private void metodo105(Token token) throws SemanticError {
        
       // throw new SemanticError("Not supported yet." , 1); //To change body of generated methods, choose Tools | Templates.
    }
    private void metodo106(Token token) throws SemanticError {
        
       // throw new SemanticError("Not supported yet." , 1); //To change body of generated methods, choose Tools | Templates.
    }
    private void metodo107(Token token) throws SemanticError {
        
       // throw new SemanticError("Not supported yet." , 1); //To change body of generated methods, choose Tools | Templates.
    }
    private void metodo108(Token token) throws SemanticError {
        
       // throw new SemanticError("Not supported yet." , 1); //To change body of generated methods, choose Tools | Templates.
    }
    private void metodo109(Token token) throws SemanticError {
        
       // throw new SemanticError("Not supported yet." , 1); //To change body of generated methods, choose Tools | Templates.
    }
    private void metodo110(Token token) throws SemanticError {
        this.contextoLID = "par-formal";
       // throw new SemanticError("Not supported yet." , 1); //To change body of generated methods, choose Tools | Templates.
    }
    private void metodo111(Token token) throws SemanticError {
        
       // throw new SemanticError("Not supported yet." , 1); //To change body of generated methods, choose Tools | Templates.
    }
    private void metodo112(Token token) throws SemanticError {
        
       // throw new SemanticError("Not supported yet." , 1); //To change body of generated methods, choose Tools | Templates.
    }
    private void metodo113(Token token) throws SemanticError {
        
       // throw new SemanticError("Not supported yet." , 1); //To change body of generated methods, choose Tools | Templates.
    }
    private void metodo114(Token token) throws SemanticError {
        if( this.contextoLID.equals("decl") )
        {
            if ( this.ts.verificaIdDeclarado(token) )
            {
                throw new SemanticError("ID já declarado.", token.getPosition() );
            }
            Simbolo s = new Simbolo( token.getLexeme() );
            
            this.ts.adicionaSimbolo(s);
            int posSimboloAtual = this.ts.getQuantiTotalElements()-1;
            if( this.eh_registro )
            {
                this.ListaReg.add(posSimboloAtual);
            }
            else
            {
                this.ListaVar.add(posSimboloAtual);
            }
        }
        if( this.contextoLID.equals("par-formal") )
        {
            if ( this.ts.verificaIdDeclarado(token) )
            {
                throw new SemanticError("ID de parâmetro repetido.", token.getPosition() );
            }
            Simbolo s = new Simbolo( token.getLexeme() );
            
            this.ts.adicionaSimbolo(s);
            int posSimboloAtual = this.ts.getQuantiTotalElements()-1;
            this.ListaAux.add(posSimboloAtual);
            this.NPF++;
        }
       // throw new SemanticError("Not supported yet." , 1); //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo115(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo116(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo117(Token token) {
        this.TipoAtual = "inteiro";
    }

    private void metodo118(Token token) {
        this.TipoAtual = "real";
    }

    private void metodo119(Token token) {
        this.TipoAtual = "boobleano";
    }

    private void metodo120(Token token) {
        this.TipoAtual = "caracter";
    }

    private void metodo121(Token token) throws SemanticError {
        if( !this.TipoConst.equals("inteiro") )
        {
            throw new SemanticError("Esperava-se uma consante inteira", token.getPosition() );
        }
        if( Integer.parseInt(token.getLexeme()) > 255 )
        {
            throw new SemanticError("tam. da cadeia > que o permitido", token.getPosition() );
        }
        else
        {
            this.TipoAtual = "cadeia";
        }
    }

    private void metodo122(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo123(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo124(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo125(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo126(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo127(Token token) throws SemanticError {
        if ( !this.ts.verificaIdDeclarado(token) )
        {
            throw new SemanticError("ID não Declarado.", token.getPosition() );
        }
        Simbolo s = this.ts.retornaSimboloPeloID(token.getLexeme());
        if( s == null )
        {
            throw new SemanticError("erro não esperado regra #127", token.getPosition() );
        }
        if( !s.getCategoria().equals("ID-CONST") )
        {
           throw new SemanticError("Esperava-se um id de constante", token.getPosition() ); 
        }
        else
        {
            
        }
    }

    private void metodo128(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo130(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo131(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo132(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo133(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo134(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo135(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo136(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo137(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo138(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo139(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo140(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo141(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo142(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo143(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo144(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo145(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo146(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo147(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo148(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo149(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo150(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo151(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo152(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo153(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo154(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo155(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo156(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo157(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo158(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo159(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo160(Token token) {
        //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo161(Token token) {
          //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo162(Token token) {
          //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo163(Token token) {
          //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo164(Token token) {
          //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo165(Token token) {
          //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo166(Token token) {
          //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo167(Token token) {
          //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo168(Token token) {
          //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo169(Token token) {
          //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo170(Token token) {
          //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo171(Token token) {
          //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo172(Token token) {
          //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo173(Token token) {
          //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo174(Token token) {
          //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo175(Token token) {
          //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo176(Token token) {
          //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo177(Token token) {
          //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo178(Token token) {
          //To change body of generated methods, choose Tools | Templates.
    }

    private void metodo179(Token token) {
          //To change body of generated methods, choose Tools | Templates.
    }
}
