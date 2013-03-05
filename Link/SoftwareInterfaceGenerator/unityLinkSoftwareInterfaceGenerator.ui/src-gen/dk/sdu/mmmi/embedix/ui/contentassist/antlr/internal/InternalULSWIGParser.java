package dk.sdu.mmmi.embedix.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import dk.sdu.mmmi.embedix.services.ULSWIGGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalULSWIGParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_HEX_NUM", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'READ'", "'WRITE'", "'link'", "';'", "'('", "')'", "'{'", "'}'", "','", "':'", "'@'", "'TOSNET'", "'CTRL'", "'='", "'BASE'", "'UART'", "'+'", "'ID'", "'CRC'", "'PUBLISH'", "'.'", "'ALL'", "'public'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_HEX_NUM=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalULSWIGParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalULSWIGParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalULSWIGParser.tokenNames; }
    public String getGrammarFileName() { return "../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g"; }


     
     	private ULSWIGGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ULSWIGGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleLinkSpec"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:60:1: entryRuleLinkSpec : ruleLinkSpec EOF ;
    public final void entryRuleLinkSpec() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:61:1: ( ruleLinkSpec EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:62:1: ruleLinkSpec EOF
            {
             before(grammarAccess.getLinkSpecRule()); 
            pushFollow(FOLLOW_ruleLinkSpec_in_entryRuleLinkSpec61);
            ruleLinkSpec();

            state._fsp--;

             after(grammarAccess.getLinkSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkSpec68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLinkSpec"


    // $ANTLR start "ruleLinkSpec"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:69:1: ruleLinkSpec : ( ( rule__LinkSpec__Group__0 ) ) ;
    public final void ruleLinkSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:73:2: ( ( ( rule__LinkSpec__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:74:1: ( ( rule__LinkSpec__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:74:1: ( ( rule__LinkSpec__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:75:1: ( rule__LinkSpec__Group__0 )
            {
             before(grammarAccess.getLinkSpecAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:76:1: ( rule__LinkSpec__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:76:2: rule__LinkSpec__Group__0
            {
            pushFollow(FOLLOW_rule__LinkSpec__Group__0_in_ruleLinkSpec94);
            rule__LinkSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinkSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinkSpec"


    // $ANTLR start "entryRuleConstructor"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:88:1: entryRuleConstructor : ruleConstructor EOF ;
    public final void entryRuleConstructor() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:89:1: ( ruleConstructor EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:90:1: ruleConstructor EOF
            {
             before(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_ruleConstructor_in_entryRuleConstructor121);
            ruleConstructor();

            state._fsp--;

             after(grammarAccess.getConstructorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:97:1: ruleConstructor : ( ( rule__Constructor__Group__0 ) ) ;
    public final void ruleConstructor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:101:2: ( ( ( rule__Constructor__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:102:1: ( ( rule__Constructor__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:102:1: ( ( rule__Constructor__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:103:1: ( rule__Constructor__Group__0 )
            {
             before(grammarAccess.getConstructorAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:104:1: ( rule__Constructor__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:104:2: rule__Constructor__Group__0
            {
            pushFollow(FOLLOW_rule__Constructor__Group__0_in_ruleConstructor154);
            rule__Constructor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleConstructorAddressParameters"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:116:1: entryRuleConstructorAddressParameters : ruleConstructorAddressParameters EOF ;
    public final void entryRuleConstructorAddressParameters() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:117:1: ( ruleConstructorAddressParameters EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:118:1: ruleConstructorAddressParameters EOF
            {
             before(grammarAccess.getConstructorAddressParametersRule()); 
            pushFollow(FOLLOW_ruleConstructorAddressParameters_in_entryRuleConstructorAddressParameters181);
            ruleConstructorAddressParameters();

            state._fsp--;

             after(grammarAccess.getConstructorAddressParametersRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructorAddressParameters188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstructorAddressParameters"


    // $ANTLR start "ruleConstructorAddressParameters"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:125:1: ruleConstructorAddressParameters : ( ( rule__ConstructorAddressParameters__Alternatives ) ) ;
    public final void ruleConstructorAddressParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:129:2: ( ( ( rule__ConstructorAddressParameters__Alternatives ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:130:1: ( ( rule__ConstructorAddressParameters__Alternatives ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:130:1: ( ( rule__ConstructorAddressParameters__Alternatives ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:131:1: ( rule__ConstructorAddressParameters__Alternatives )
            {
             before(grammarAccess.getConstructorAddressParametersAccess().getAlternatives()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:132:1: ( rule__ConstructorAddressParameters__Alternatives )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:132:2: rule__ConstructorAddressParameters__Alternatives
            {
            pushFollow(FOLLOW_rule__ConstructorAddressParameters__Alternatives_in_ruleConstructorAddressParameters214);
            rule__ConstructorAddressParameters__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAddressParametersAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstructorAddressParameters"


    // $ANTLR start "entryRuleNamedAddresses"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:144:1: entryRuleNamedAddresses : ruleNamedAddresses EOF ;
    public final void entryRuleNamedAddresses() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:145:1: ( ruleNamedAddresses EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:146:1: ruleNamedAddresses EOF
            {
             before(grammarAccess.getNamedAddressesRule()); 
            pushFollow(FOLLOW_ruleNamedAddresses_in_entryRuleNamedAddresses241);
            ruleNamedAddresses();

            state._fsp--;

             after(grammarAccess.getNamedAddressesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedAddresses248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamedAddresses"


    // $ANTLR start "ruleNamedAddresses"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:153:1: ruleNamedAddresses : ( ( rule__NamedAddresses__Group__0 ) ) ;
    public final void ruleNamedAddresses() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:157:2: ( ( ( rule__NamedAddresses__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:158:1: ( ( rule__NamedAddresses__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:158:1: ( ( rule__NamedAddresses__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:159:1: ( rule__NamedAddresses__Group__0 )
            {
             before(grammarAccess.getNamedAddressesAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:160:1: ( rule__NamedAddresses__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:160:2: rule__NamedAddresses__Group__0
            {
            pushFollow(FOLLOW_rule__NamedAddresses__Group__0_in_ruleNamedAddresses274);
            rule__NamedAddresses__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamedAddressesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedAddresses"


    // $ANTLR start "entryRuleAddressTuple"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:172:1: entryRuleAddressTuple : ruleAddressTuple EOF ;
    public final void entryRuleAddressTuple() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:173:1: ( ruleAddressTuple EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:174:1: ruleAddressTuple EOF
            {
             before(grammarAccess.getAddressTupleRule()); 
            pushFollow(FOLLOW_ruleAddressTuple_in_entryRuleAddressTuple301);
            ruleAddressTuple();

            state._fsp--;

             after(grammarAccess.getAddressTupleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressTuple308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddressTuple"


    // $ANTLR start "ruleAddressTuple"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:181:1: ruleAddressTuple : ( ( rule__AddressTuple__Group__0 ) ) ;
    public final void ruleAddressTuple() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:185:2: ( ( ( rule__AddressTuple__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:186:1: ( ( rule__AddressTuple__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:186:1: ( ( rule__AddressTuple__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:187:1: ( rule__AddressTuple__Group__0 )
            {
             before(grammarAccess.getAddressTupleAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:188:1: ( rule__AddressTuple__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:188:2: rule__AddressTuple__Group__0
            {
            pushFollow(FOLLOW_rule__AddressTuple__Group__0_in_ruleAddressTuple334);
            rule__AddressTuple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddressTupleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddressTuple"


    // $ANTLR start "entryRuleMember"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:200:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:201:1: ( ruleMember EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:202:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember361);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:209:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:213:2: ( ( ( rule__Member__Alternatives ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:214:1: ( ( rule__Member__Alternatives ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:214:1: ( ( rule__Member__Alternatives ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:215:1: ( rule__Member__Alternatives )
            {
             before(grammarAccess.getMemberAccess().getAlternatives()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:216:1: ( rule__Member__Alternatives )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:216:2: rule__Member__Alternatives
            {
            pushFollow(FOLLOW_rule__Member__Alternatives_in_ruleMember394);
            rule__Member__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleLinkBinding"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:228:1: entryRuleLinkBinding : ruleLinkBinding EOF ;
    public final void entryRuleLinkBinding() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:229:1: ( ruleLinkBinding EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:230:1: ruleLinkBinding EOF
            {
             before(grammarAccess.getLinkBindingRule()); 
            pushFollow(FOLLOW_ruleLinkBinding_in_entryRuleLinkBinding421);
            ruleLinkBinding();

            state._fsp--;

             after(grammarAccess.getLinkBindingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkBinding428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLinkBinding"


    // $ANTLR start "ruleLinkBinding"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:237:1: ruleLinkBinding : ( ruleTosNetLinkBinding ) ;
    public final void ruleLinkBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:241:2: ( ( ruleTosNetLinkBinding ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:242:1: ( ruleTosNetLinkBinding )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:242:1: ( ruleTosNetLinkBinding )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:243:1: ruleTosNetLinkBinding
            {
             before(grammarAccess.getLinkBindingAccess().getTosNetLinkBindingParserRuleCall()); 
            pushFollow(FOLLOW_ruleTosNetLinkBinding_in_ruleLinkBinding454);
            ruleTosNetLinkBinding();

            state._fsp--;

             after(grammarAccess.getLinkBindingAccess().getTosNetLinkBindingParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinkBinding"


    // $ANTLR start "entryRuleTosNetLinkBinding"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:256:1: entryRuleTosNetLinkBinding : ruleTosNetLinkBinding EOF ;
    public final void entryRuleTosNetLinkBinding() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:257:1: ( ruleTosNetLinkBinding EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:258:1: ruleTosNetLinkBinding EOF
            {
             before(grammarAccess.getTosNetLinkBindingRule()); 
            pushFollow(FOLLOW_ruleTosNetLinkBinding_in_entryRuleTosNetLinkBinding480);
            ruleTosNetLinkBinding();

            state._fsp--;

             after(grammarAccess.getTosNetLinkBindingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTosNetLinkBinding487); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTosNetLinkBinding"


    // $ANTLR start "ruleTosNetLinkBinding"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:265:1: ruleTosNetLinkBinding : ( ( rule__TosNetLinkBinding__Group__0 ) ) ;
    public final void ruleTosNetLinkBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:269:2: ( ( ( rule__TosNetLinkBinding__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:270:1: ( ( rule__TosNetLinkBinding__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:270:1: ( ( rule__TosNetLinkBinding__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:271:1: ( rule__TosNetLinkBinding__Group__0 )
            {
             before(grammarAccess.getTosNetLinkBindingAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:272:1: ( rule__TosNetLinkBinding__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:272:2: rule__TosNetLinkBinding__Group__0
            {
            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group__0_in_ruleTosNetLinkBinding513);
            rule__TosNetLinkBinding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTosNetLinkBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTosNetLinkBinding"


    // $ANTLR start "entryRuleLinkProperty"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:284:1: entryRuleLinkProperty : ruleLinkProperty EOF ;
    public final void entryRuleLinkProperty() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:285:1: ( ruleLinkProperty EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:286:1: ruleLinkProperty EOF
            {
             before(grammarAccess.getLinkPropertyRule()); 
            pushFollow(FOLLOW_ruleLinkProperty_in_entryRuleLinkProperty540);
            ruleLinkProperty();

            state._fsp--;

             after(grammarAccess.getLinkPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkProperty547); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLinkProperty"


    // $ANTLR start "ruleLinkProperty"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:293:1: ruleLinkProperty : ( ( rule__LinkProperty__Alternatives ) ) ;
    public final void ruleLinkProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:297:2: ( ( ( rule__LinkProperty__Alternatives ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:298:1: ( ( rule__LinkProperty__Alternatives ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:298:1: ( ( rule__LinkProperty__Alternatives ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:299:1: ( rule__LinkProperty__Alternatives )
            {
             before(grammarAccess.getLinkPropertyAccess().getAlternatives()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:300:1: ( rule__LinkProperty__Alternatives )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:300:2: rule__LinkProperty__Alternatives
            {
            pushFollow(FOLLOW_rule__LinkProperty__Alternatives_in_ruleLinkProperty573);
            rule__LinkProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLinkPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinkProperty"


    // $ANTLR start "entryRuleExpansion"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:312:1: entryRuleExpansion : ruleExpansion EOF ;
    public final void entryRuleExpansion() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:313:1: ( ruleExpansion EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:314:1: ruleExpansion EOF
            {
             before(grammarAccess.getExpansionRule()); 
            pushFollow(FOLLOW_ruleExpansion_in_entryRuleExpansion600);
            ruleExpansion();

            state._fsp--;

             after(grammarAccess.getExpansionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpansion607); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpansion"


    // $ANTLR start "ruleExpansion"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:321:1: ruleExpansion : ( ( rule__Expansion__Alternatives ) ) ;
    public final void ruleExpansion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:325:2: ( ( ( rule__Expansion__Alternatives ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:326:1: ( ( rule__Expansion__Alternatives ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:326:1: ( ( rule__Expansion__Alternatives ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:327:1: ( rule__Expansion__Alternatives )
            {
             before(grammarAccess.getExpansionAccess().getAlternatives()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:328:1: ( rule__Expansion__Alternatives )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:328:2: rule__Expansion__Alternatives
            {
            pushFollow(FOLLOW_rule__Expansion__Alternatives_in_ruleExpansion633);
            rule__Expansion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpansionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpansion"


    // $ANTLR start "entryRuleSimpleExpansion"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:340:1: entryRuleSimpleExpansion : ruleSimpleExpansion EOF ;
    public final void entryRuleSimpleExpansion() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:341:1: ( ruleSimpleExpansion EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:342:1: ruleSimpleExpansion EOF
            {
             before(grammarAccess.getSimpleExpansionRule()); 
            pushFollow(FOLLOW_ruleSimpleExpansion_in_entryRuleSimpleExpansion660);
            ruleSimpleExpansion();

            state._fsp--;

             after(grammarAccess.getSimpleExpansionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpansion667); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleExpansion"


    // $ANTLR start "ruleSimpleExpansion"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:349:1: ruleSimpleExpansion : ( ( rule__SimpleExpansion__Group__0 ) ) ;
    public final void ruleSimpleExpansion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:353:2: ( ( ( rule__SimpleExpansion__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:354:1: ( ( rule__SimpleExpansion__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:354:1: ( ( rule__SimpleExpansion__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:355:1: ( rule__SimpleExpansion__Group__0 )
            {
             before(grammarAccess.getSimpleExpansionAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:356:1: ( rule__SimpleExpansion__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:356:2: rule__SimpleExpansion__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group__0_in_ruleSimpleExpansion693);
            rule__SimpleExpansion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleExpansionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleExpansion"


    // $ANTLR start "entryRuleAddressExpansion"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:368:1: entryRuleAddressExpansion : ruleAddressExpansion EOF ;
    public final void entryRuleAddressExpansion() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:369:1: ( ruleAddressExpansion EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:370:1: ruleAddressExpansion EOF
            {
             before(grammarAccess.getAddressExpansionRule()); 
            pushFollow(FOLLOW_ruleAddressExpansion_in_entryRuleAddressExpansion720);
            ruleAddressExpansion();

            state._fsp--;

             after(grammarAccess.getAddressExpansionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressExpansion727); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddressExpansion"


    // $ANTLR start "ruleAddressExpansion"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:377:1: ruleAddressExpansion : ( ( rule__AddressExpansion__Group__0 ) ) ;
    public final void ruleAddressExpansion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:381:2: ( ( ( rule__AddressExpansion__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:382:1: ( ( rule__AddressExpansion__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:382:1: ( ( rule__AddressExpansion__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:383:1: ( rule__AddressExpansion__Group__0 )
            {
             before(grammarAccess.getAddressExpansionAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:384:1: ( rule__AddressExpansion__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:384:2: rule__AddressExpansion__Group__0
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group__0_in_ruleAddressExpansion753);
            rule__AddressExpansion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddressExpansionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddressExpansion"


    // $ANTLR start "entryRuleArgument"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:396:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:397:1: ( ruleArgument EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:398:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument780);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument787); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:405:1: ruleArgument : ( ( rule__Argument__Alternatives ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:409:2: ( ( ( rule__Argument__Alternatives ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:410:1: ( ( rule__Argument__Alternatives ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:410:1: ( ( rule__Argument__Alternatives ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:411:1: ( rule__Argument__Alternatives )
            {
             before(grammarAccess.getArgumentAccess().getAlternatives()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:412:1: ( rule__Argument__Alternatives )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:412:2: rule__Argument__Alternatives
            {
            pushFollow(FOLLOW_rule__Argument__Alternatives_in_ruleArgument813);
            rule__Argument__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleAddressBinding"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:424:1: entryRuleAddressBinding : ruleAddressBinding EOF ;
    public final void entryRuleAddressBinding() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:425:1: ( ruleAddressBinding EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:426:1: ruleAddressBinding EOF
            {
             before(grammarAccess.getAddressBindingRule()); 
            pushFollow(FOLLOW_ruleAddressBinding_in_entryRuleAddressBinding840);
            ruleAddressBinding();

            state._fsp--;

             after(grammarAccess.getAddressBindingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressBinding847); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddressBinding"


    // $ANTLR start "ruleAddressBinding"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:433:1: ruleAddressBinding : ( ( rule__AddressBinding__Group__0 ) ) ;
    public final void ruleAddressBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:437:2: ( ( ( rule__AddressBinding__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:438:1: ( ( rule__AddressBinding__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:438:1: ( ( rule__AddressBinding__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:439:1: ( rule__AddressBinding__Group__0 )
            {
             before(grammarAccess.getAddressBindingAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:440:1: ( rule__AddressBinding__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:440:2: rule__AddressBinding__Group__0
            {
            pushFollow(FOLLOW_rule__AddressBinding__Group__0_in_ruleAddressBinding873);
            rule__AddressBinding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddressBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddressBinding"


    // $ANTLR start "entryRuleInstantiation"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:452:1: entryRuleInstantiation : ruleInstantiation EOF ;
    public final void entryRuleInstantiation() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:453:1: ( ruleInstantiation EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:454:1: ruleInstantiation EOF
            {
             before(grammarAccess.getInstantiationRule()); 
            pushFollow(FOLLOW_ruleInstantiation_in_entryRuleInstantiation900);
            ruleInstantiation();

            state._fsp--;

             after(grammarAccess.getInstantiationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstantiation907); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstantiation"


    // $ANTLR start "ruleInstantiation"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:461:1: ruleInstantiation : ( ( rule__Instantiation__Group__0 ) ) ;
    public final void ruleInstantiation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:465:2: ( ( ( rule__Instantiation__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:466:1: ( ( rule__Instantiation__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:466:1: ( ( rule__Instantiation__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:467:1: ( rule__Instantiation__Group__0 )
            {
             before(grammarAccess.getInstantiationAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:468:1: ( rule__Instantiation__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:468:2: rule__Instantiation__Group__0
            {
            pushFollow(FOLLOW_rule__Instantiation__Group__0_in_ruleInstantiation933);
            rule__Instantiation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstantiationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstantiation"


    // $ANTLR start "entryRuleAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:480:1: entryRuleAddressSpec : ruleAddressSpec EOF ;
    public final void entryRuleAddressSpec() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:481:1: ( ruleAddressSpec EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:482:1: ruleAddressSpec EOF
            {
             before(grammarAccess.getAddressSpecRule()); 
            pushFollow(FOLLOW_ruleAddressSpec_in_entryRuleAddressSpec960);
            ruleAddressSpec();

            state._fsp--;

             after(grammarAccess.getAddressSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressSpec967); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddressSpec"


    // $ANTLR start "ruleAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:489:1: ruleAddressSpec : ( ( rule__AddressSpec__Alternatives ) ) ;
    public final void ruleAddressSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:493:2: ( ( ( rule__AddressSpec__Alternatives ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:494:1: ( ( rule__AddressSpec__Alternatives ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:494:1: ( ( rule__AddressSpec__Alternatives ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:495:1: ( rule__AddressSpec__Alternatives )
            {
             before(grammarAccess.getAddressSpecAccess().getAlternatives()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:496:1: ( rule__AddressSpec__Alternatives )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:496:2: rule__AddressSpec__Alternatives
            {
            pushFollow(FOLLOW_rule__AddressSpec__Alternatives_in_ruleAddressSpec993);
            rule__AddressSpec__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAddressSpecAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddressSpec"


    // $ANTLR start "entryRuleDirectAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:508:1: entryRuleDirectAddressSpec : ruleDirectAddressSpec EOF ;
    public final void entryRuleDirectAddressSpec() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:509:1: ( ruleDirectAddressSpec EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:510:1: ruleDirectAddressSpec EOF
            {
             before(grammarAccess.getDirectAddressSpecRule()); 
            pushFollow(FOLLOW_ruleDirectAddressSpec_in_entryRuleDirectAddressSpec1020);
            ruleDirectAddressSpec();

            state._fsp--;

             after(grammarAccess.getDirectAddressSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectAddressSpec1027); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDirectAddressSpec"


    // $ANTLR start "ruleDirectAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:517:1: ruleDirectAddressSpec : ( ( rule__DirectAddressSpec__Group__0 ) ) ;
    public final void ruleDirectAddressSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:521:2: ( ( ( rule__DirectAddressSpec__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:522:1: ( ( rule__DirectAddressSpec__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:522:1: ( ( rule__DirectAddressSpec__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:523:1: ( rule__DirectAddressSpec__Group__0 )
            {
             before(grammarAccess.getDirectAddressSpecAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:524:1: ( rule__DirectAddressSpec__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:524:2: rule__DirectAddressSpec__Group__0
            {
            pushFollow(FOLLOW_rule__DirectAddressSpec__Group__0_in_ruleDirectAddressSpec1053);
            rule__DirectAddressSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDirectAddressSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirectAddressSpec"


    // $ANTLR start "entryRuleNamedAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:536:1: entryRuleNamedAddressSpec : ruleNamedAddressSpec EOF ;
    public final void entryRuleNamedAddressSpec() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:537:1: ( ruleNamedAddressSpec EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:538:1: ruleNamedAddressSpec EOF
            {
             before(grammarAccess.getNamedAddressSpecRule()); 
            pushFollow(FOLLOW_ruleNamedAddressSpec_in_entryRuleNamedAddressSpec1080);
            ruleNamedAddressSpec();

            state._fsp--;

             after(grammarAccess.getNamedAddressSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedAddressSpec1087); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNamedAddressSpec"


    // $ANTLR start "ruleNamedAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:545:1: ruleNamedAddressSpec : ( ( rule__NamedAddressSpec__NameAssignment ) ) ;
    public final void ruleNamedAddressSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:549:2: ( ( ( rule__NamedAddressSpec__NameAssignment ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:550:1: ( ( rule__NamedAddressSpec__NameAssignment ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:550:1: ( ( rule__NamedAddressSpec__NameAssignment ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:551:1: ( rule__NamedAddressSpec__NameAssignment )
            {
             before(grammarAccess.getNamedAddressSpecAccess().getNameAssignment()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:552:1: ( rule__NamedAddressSpec__NameAssignment )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:552:2: rule__NamedAddressSpec__NameAssignment
            {
            pushFollow(FOLLOW_rule__NamedAddressSpec__NameAssignment_in_ruleNamedAddressSpec1113);
            rule__NamedAddressSpec__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNamedAddressSpecAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedAddressSpec"


    // $ANTLR start "entryRuleKind"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:564:1: entryRuleKind : ruleKind EOF ;
    public final void entryRuleKind() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:565:1: ( ruleKind EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:566:1: ruleKind EOF
            {
             before(grammarAccess.getKindRule()); 
            pushFollow(FOLLOW_ruleKind_in_entryRuleKind1140);
            ruleKind();

            state._fsp--;

             after(grammarAccess.getKindRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKind1147); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKind"


    // $ANTLR start "ruleKind"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:573:1: ruleKind : ( ( rule__Kind__Alternatives ) ) ;
    public final void ruleKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:577:2: ( ( ( rule__Kind__Alternatives ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:578:1: ( ( rule__Kind__Alternatives ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:578:1: ( ( rule__Kind__Alternatives ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:579:1: ( rule__Kind__Alternatives )
            {
             before(grammarAccess.getKindAccess().getAlternatives()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:580:1: ( rule__Kind__Alternatives )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:580:2: rule__Kind__Alternatives
            {
            pushFollow(FOLLOW_rule__Kind__Alternatives_in_ruleKind1173);
            rule__Kind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKind"


    // $ANTLR start "entryRuleInstantiationProperty"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:592:1: entryRuleInstantiationProperty : ruleInstantiationProperty EOF ;
    public final void entryRuleInstantiationProperty() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:593:1: ( ruleInstantiationProperty EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:594:1: ruleInstantiationProperty EOF
            {
             before(grammarAccess.getInstantiationPropertyRule()); 
            pushFollow(FOLLOW_ruleInstantiationProperty_in_entryRuleInstantiationProperty1200);
            ruleInstantiationProperty();

            state._fsp--;

             after(grammarAccess.getInstantiationPropertyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstantiationProperty1207); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstantiationProperty"


    // $ANTLR start "ruleInstantiationProperty"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:601:1: ruleInstantiationProperty : ( ( rule__InstantiationProperty__Alternatives ) ) ;
    public final void ruleInstantiationProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:605:2: ( ( ( rule__InstantiationProperty__Alternatives ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:606:1: ( ( rule__InstantiationProperty__Alternatives ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:606:1: ( ( rule__InstantiationProperty__Alternatives ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:607:1: ( rule__InstantiationProperty__Alternatives )
            {
             before(grammarAccess.getInstantiationPropertyAccess().getAlternatives()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:608:1: ( rule__InstantiationProperty__Alternatives )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:608:2: rule__InstantiationProperty__Alternatives
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Alternatives_in_ruleInstantiationProperty1233);
            rule__InstantiationProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstantiationPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstantiationProperty"


    // $ANTLR start "entryRuleGrouping"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:620:1: entryRuleGrouping : ruleGrouping EOF ;
    public final void entryRuleGrouping() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:621:1: ( ruleGrouping EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:622:1: ruleGrouping EOF
            {
             before(grammarAccess.getGroupingRule()); 
            pushFollow(FOLLOW_ruleGrouping_in_entryRuleGrouping1260);
            ruleGrouping();

            state._fsp--;

             after(grammarAccess.getGroupingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrouping1267); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrouping"


    // $ANTLR start "ruleGrouping"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:629:1: ruleGrouping : ( ( rule__Grouping__Group__0 ) ) ;
    public final void ruleGrouping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:633:2: ( ( ( rule__Grouping__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:634:1: ( ( rule__Grouping__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:634:1: ( ( rule__Grouping__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:635:1: ( rule__Grouping__Group__0 )
            {
             before(grammarAccess.getGroupingAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:636:1: ( rule__Grouping__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:636:2: rule__Grouping__Group__0
            {
            pushFollow(FOLLOW_rule__Grouping__Group__0_in_ruleGrouping1293);
            rule__Grouping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrouping"


    // $ANTLR start "entryRuleGroupElement"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:648:1: entryRuleGroupElement : ruleGroupElement EOF ;
    public final void entryRuleGroupElement() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:649:1: ( ruleGroupElement EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:650:1: ruleGroupElement EOF
            {
             before(grammarAccess.getGroupElementRule()); 
            pushFollow(FOLLOW_ruleGroupElement_in_entryRuleGroupElement1320);
            ruleGroupElement();

            state._fsp--;

             after(grammarAccess.getGroupElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupElement1327); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGroupElement"


    // $ANTLR start "ruleGroupElement"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:657:1: ruleGroupElement : ( ( rule__GroupElement__Group__0 ) ) ;
    public final void ruleGroupElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:661:2: ( ( ( rule__GroupElement__Group__0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:662:1: ( ( rule__GroupElement__Group__0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:662:1: ( ( rule__GroupElement__Group__0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:663:1: ( rule__GroupElement__Group__0 )
            {
             before(grammarAccess.getGroupElementAccess().getGroup()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:664:1: ( rule__GroupElement__Group__0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:664:2: rule__GroupElement__Group__0
            {
            pushFollow(FOLLOW_rule__GroupElement__Group__0_in_ruleGroupElement1353);
            rule__GroupElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroupElement"


    // $ANTLR start "entryRulePathElement"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:676:1: entryRulePathElement : rulePathElement EOF ;
    public final void entryRulePathElement() throws RecognitionException {
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:677:1: ( rulePathElement EOF )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:678:1: rulePathElement EOF
            {
             before(grammarAccess.getPathElementRule()); 
            pushFollow(FOLLOW_rulePathElement_in_entryRulePathElement1380);
            rulePathElement();

            state._fsp--;

             after(grammarAccess.getPathElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathElement1387); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePathElement"


    // $ANTLR start "rulePathElement"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:685:1: rulePathElement : ( ( rule__PathElement__Alternatives ) ) ;
    public final void rulePathElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:689:2: ( ( ( rule__PathElement__Alternatives ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:690:1: ( ( rule__PathElement__Alternatives ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:690:1: ( ( rule__PathElement__Alternatives ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:691:1: ( rule__PathElement__Alternatives )
            {
             before(grammarAccess.getPathElementAccess().getAlternatives()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:692:1: ( rule__PathElement__Alternatives )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:692:2: rule__PathElement__Alternatives
            {
            pushFollow(FOLLOW_rule__PathElement__Alternatives_in_rulePathElement1413);
            rule__PathElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPathElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePathElement"


    // $ANTLR start "rule__ConstructorAddressParameters__Alternatives"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:704:1: rule__ConstructorAddressParameters__Alternatives : ( ( ruleNamedAddresses ) | ( ruleAddressTuple ) );
    public final void rule__ConstructorAddressParameters__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:708:1: ( ( ruleNamedAddresses ) | ( ruleAddressTuple ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==22) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID) ) {
                    alt1=1;
                }
                else if ( (LA1_1==16) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:709:1: ( ruleNamedAddresses )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:709:1: ( ruleNamedAddresses )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:710:1: ruleNamedAddresses
                    {
                     before(grammarAccess.getConstructorAddressParametersAccess().getNamedAddressesParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNamedAddresses_in_rule__ConstructorAddressParameters__Alternatives1449);
                    ruleNamedAddresses();

                    state._fsp--;

                     after(grammarAccess.getConstructorAddressParametersAccess().getNamedAddressesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:715:6: ( ruleAddressTuple )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:715:6: ( ruleAddressTuple )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:716:1: ruleAddressTuple
                    {
                     before(grammarAccess.getConstructorAddressParametersAccess().getAddressTupleParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAddressTuple_in_rule__ConstructorAddressParameters__Alternatives1466);
                    ruleAddressTuple();

                    state._fsp--;

                     after(grammarAccess.getConstructorAddressParametersAccess().getAddressTupleParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstructorAddressParameters__Alternatives"


    // $ANTLR start "rule__Member__Alternatives"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:726:1: rule__Member__Alternatives : ( ( ruleLinkBinding ) | ( ruleExpansion ) | ( ruleInstantiation ) | ( ruleGrouping ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:730:1: ( ( ruleLinkBinding ) | ( ruleExpansion ) | ( ruleInstantiation ) | ( ruleGrouping ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==25) ) {
                    alt2=4;
                }
                else if ( (LA2_2==21) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==RULE_ID) ) {
                    int LA2_6 = input.LA(3);

                    if ( (LA2_6==21) ) {
                        int LA2_7 = input.LA(4);

                        if ( ((LA2_7>=12 && LA2_7<=13)) ) {
                            alt2=3;
                        }
                        else if ( (LA2_7==RULE_ID) ) {
                            alt2=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 7, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA2_6==25) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:731:1: ( ruleLinkBinding )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:731:1: ( ruleLinkBinding )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:732:1: ruleLinkBinding
                    {
                     before(grammarAccess.getMemberAccess().getLinkBindingParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleLinkBinding_in_rule__Member__Alternatives1498);
                    ruleLinkBinding();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getLinkBindingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:737:6: ( ruleExpansion )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:737:6: ( ruleExpansion )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:738:1: ruleExpansion
                    {
                     before(grammarAccess.getMemberAccess().getExpansionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleExpansion_in_rule__Member__Alternatives1515);
                    ruleExpansion();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getExpansionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:743:6: ( ruleInstantiation )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:743:6: ( ruleInstantiation )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:744:1: ruleInstantiation
                    {
                     before(grammarAccess.getMemberAccess().getInstantiationParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleInstantiation_in_rule__Member__Alternatives1532);
                    ruleInstantiation();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getInstantiationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:749:6: ( ruleGrouping )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:749:6: ( ruleGrouping )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:750:1: ruleGrouping
                    {
                     before(grammarAccess.getMemberAccess().getGroupingParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleGrouping_in_rule__Member__Alternatives1549);
                    ruleGrouping();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getGroupingParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Alternatives"


    // $ANTLR start "rule__LinkProperty__Alternatives"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:760:1: rule__LinkProperty__Alternatives : ( ( ( rule__LinkProperty__Group_0__0 ) ) | ( ( rule__LinkProperty__Group_1__0 ) ) | ( ( rule__LinkProperty__Group_2__0 ) ) );
    public final void rule__LinkProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:764:1: ( ( ( rule__LinkProperty__Group_0__0 ) ) | ( ( rule__LinkProperty__Group_1__0 ) ) | ( ( rule__LinkProperty__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:765:1: ( ( rule__LinkProperty__Group_0__0 ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:765:1: ( ( rule__LinkProperty__Group_0__0 ) )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:766:1: ( rule__LinkProperty__Group_0__0 )
                    {
                     before(grammarAccess.getLinkPropertyAccess().getGroup_0()); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:767:1: ( rule__LinkProperty__Group_0__0 )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:767:2: rule__LinkProperty__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__LinkProperty__Group_0__0_in_rule__LinkProperty__Alternatives1581);
                    rule__LinkProperty__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLinkPropertyAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:771:6: ( ( rule__LinkProperty__Group_1__0 ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:771:6: ( ( rule__LinkProperty__Group_1__0 ) )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:772:1: ( rule__LinkProperty__Group_1__0 )
                    {
                     before(grammarAccess.getLinkPropertyAccess().getGroup_1()); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:773:1: ( rule__LinkProperty__Group_1__0 )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:773:2: rule__LinkProperty__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__LinkProperty__Group_1__0_in_rule__LinkProperty__Alternatives1599);
                    rule__LinkProperty__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLinkPropertyAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:777:6: ( ( rule__LinkProperty__Group_2__0 ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:777:6: ( ( rule__LinkProperty__Group_2__0 ) )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:778:1: ( rule__LinkProperty__Group_2__0 )
                    {
                     before(grammarAccess.getLinkPropertyAccess().getGroup_2()); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:779:1: ( rule__LinkProperty__Group_2__0 )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:779:2: rule__LinkProperty__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__LinkProperty__Group_2__0_in_rule__LinkProperty__Alternatives1617);
                    rule__LinkProperty__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLinkPropertyAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Alternatives"


    // $ANTLR start "rule__Expansion__Alternatives"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:788:1: rule__Expansion__Alternatives : ( ( ruleSimpleExpansion ) | ( ruleAddressExpansion ) );
    public final void rule__Expansion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:792:1: ( ( ruleSimpleExpansion ) | ( ruleAddressExpansion ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:793:1: ( ruleSimpleExpansion )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:793:1: ( ruleSimpleExpansion )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:794:1: ruleSimpleExpansion
                    {
                     before(grammarAccess.getExpansionAccess().getSimpleExpansionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSimpleExpansion_in_rule__Expansion__Alternatives1650);
                    ruleSimpleExpansion();

                    state._fsp--;

                     after(grammarAccess.getExpansionAccess().getSimpleExpansionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:799:6: ( ruleAddressExpansion )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:799:6: ( ruleAddressExpansion )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:800:1: ruleAddressExpansion
                    {
                     before(grammarAccess.getExpansionAccess().getAddressExpansionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAddressExpansion_in_rule__Expansion__Alternatives1667);
                    ruleAddressExpansion();

                    state._fsp--;

                     after(grammarAccess.getExpansionAccess().getAddressExpansionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expansion__Alternatives"


    // $ANTLR start "rule__Argument__Alternatives"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:810:1: rule__Argument__Alternatives : ( ( ( rule__Argument__SimpleAssignment_0 ) ) | ( ( rule__Argument__Group_1__0 ) ) | ( ( rule__Argument__TextAssignment_2 ) ) );
    public final void rule__Argument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:814:1: ( ( ( rule__Argument__SimpleAssignment_0 ) ) | ( ( rule__Argument__Group_1__0 ) ) | ( ( rule__Argument__TextAssignment_2 ) ) )
            int alt5=3;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==28) ) {
                    alt5=2;
                }
                else if ( (LA5_1==EOF||LA5_1==17||LA5_1==20) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:815:1: ( ( rule__Argument__SimpleAssignment_0 ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:815:1: ( ( rule__Argument__SimpleAssignment_0 ) )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:816:1: ( rule__Argument__SimpleAssignment_0 )
                    {
                     before(grammarAccess.getArgumentAccess().getSimpleAssignment_0()); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:817:1: ( rule__Argument__SimpleAssignment_0 )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:817:2: rule__Argument__SimpleAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Argument__SimpleAssignment_0_in_rule__Argument__Alternatives1699);
                    rule__Argument__SimpleAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArgumentAccess().getSimpleAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:821:6: ( ( rule__Argument__Group_1__0 ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:821:6: ( ( rule__Argument__Group_1__0 ) )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:822:1: ( rule__Argument__Group_1__0 )
                    {
                     before(grammarAccess.getArgumentAccess().getGroup_1()); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:823:1: ( rule__Argument__Group_1__0 )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:823:2: rule__Argument__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Argument__Group_1__0_in_rule__Argument__Alternatives1717);
                    rule__Argument__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getArgumentAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:827:6: ( ( rule__Argument__TextAssignment_2 ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:827:6: ( ( rule__Argument__TextAssignment_2 ) )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:828:1: ( rule__Argument__TextAssignment_2 )
                    {
                     before(grammarAccess.getArgumentAccess().getTextAssignment_2()); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:829:1: ( rule__Argument__TextAssignment_2 )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:829:2: rule__Argument__TextAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Argument__TextAssignment_2_in_rule__Argument__Alternatives1735);
                    rule__Argument__TextAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getArgumentAccess().getTextAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Alternatives"


    // $ANTLR start "rule__AddressSpec__Alternatives"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:838:1: rule__AddressSpec__Alternatives : ( ( ruleDirectAddressSpec ) | ( ruleNamedAddressSpec ) );
    public final void rule__AddressSpec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:842:1: ( ( ruleDirectAddressSpec ) | ( ruleNamedAddressSpec ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==25) ) {
                    alt6=1;
                }
                else if ( (LA6_1==EOF||LA6_1==21) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:843:1: ( ruleDirectAddressSpec )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:843:1: ( ruleDirectAddressSpec )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:844:1: ruleDirectAddressSpec
                    {
                     before(grammarAccess.getAddressSpecAccess().getDirectAddressSpecParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDirectAddressSpec_in_rule__AddressSpec__Alternatives1768);
                    ruleDirectAddressSpec();

                    state._fsp--;

                     after(grammarAccess.getAddressSpecAccess().getDirectAddressSpecParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:849:6: ( ruleNamedAddressSpec )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:849:6: ( ruleNamedAddressSpec )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:850:1: ruleNamedAddressSpec
                    {
                     before(grammarAccess.getAddressSpecAccess().getNamedAddressSpecParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNamedAddressSpec_in_rule__AddressSpec__Alternatives1785);
                    ruleNamedAddressSpec();

                    state._fsp--;

                     after(grammarAccess.getAddressSpecAccess().getNamedAddressSpecParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressSpec__Alternatives"


    // $ANTLR start "rule__Kind__Alternatives"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:860:1: rule__Kind__Alternatives : ( ( 'READ' ) | ( 'WRITE' ) );
    public final void rule__Kind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:864:1: ( ( 'READ' ) | ( 'WRITE' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:865:1: ( 'READ' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:865:1: ( 'READ' )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:866:1: 'READ'
                    {
                     before(grammarAccess.getKindAccess().getREADKeyword_0()); 
                    match(input,12,FOLLOW_12_in_rule__Kind__Alternatives1818); 
                     after(grammarAccess.getKindAccess().getREADKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:873:6: ( 'WRITE' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:873:6: ( 'WRITE' )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:874:1: 'WRITE'
                    {
                     before(grammarAccess.getKindAccess().getWRITEKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__Kind__Alternatives1838); 
                     after(grammarAccess.getKindAccess().getWRITEKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Kind__Alternatives"


    // $ANTLR start "rule__InstantiationProperty__Alternatives"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:886:1: rule__InstantiationProperty__Alternatives : ( ( ( rule__InstantiationProperty__Group_0__0 ) ) | ( ( rule__InstantiationProperty__Group_1__0 ) ) | ( ( rule__InstantiationProperty__Group_2__0 ) ) );
    public final void rule__InstantiationProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:890:1: ( ( ( rule__InstantiationProperty__Group_0__0 ) ) | ( ( rule__InstantiationProperty__Group_1__0 ) ) | ( ( rule__InstantiationProperty__Group_2__0 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt8=1;
                }
                break;
            case 30:
                {
                alt8=2;
                }
                break;
            case 31:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:891:1: ( ( rule__InstantiationProperty__Group_0__0 ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:891:1: ( ( rule__InstantiationProperty__Group_0__0 ) )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:892:1: ( rule__InstantiationProperty__Group_0__0 )
                    {
                     before(grammarAccess.getInstantiationPropertyAccess().getGroup_0()); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:893:1: ( rule__InstantiationProperty__Group_0__0 )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:893:2: rule__InstantiationProperty__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__InstantiationProperty__Group_0__0_in_rule__InstantiationProperty__Alternatives1872);
                    rule__InstantiationProperty__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstantiationPropertyAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:897:6: ( ( rule__InstantiationProperty__Group_1__0 ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:897:6: ( ( rule__InstantiationProperty__Group_1__0 ) )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:898:1: ( rule__InstantiationProperty__Group_1__0 )
                    {
                     before(grammarAccess.getInstantiationPropertyAccess().getGroup_1()); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:899:1: ( rule__InstantiationProperty__Group_1__0 )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:899:2: rule__InstantiationProperty__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__InstantiationProperty__Group_1__0_in_rule__InstantiationProperty__Alternatives1890);
                    rule__InstantiationProperty__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstantiationPropertyAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:903:6: ( ( rule__InstantiationProperty__Group_2__0 ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:903:6: ( ( rule__InstantiationProperty__Group_2__0 ) )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:904:1: ( rule__InstantiationProperty__Group_2__0 )
                    {
                     before(grammarAccess.getInstantiationPropertyAccess().getGroup_2()); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:905:1: ( rule__InstantiationProperty__Group_2__0 )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:905:2: rule__InstantiationProperty__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__0_in_rule__InstantiationProperty__Alternatives1908);
                    rule__InstantiationProperty__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInstantiationPropertyAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Alternatives"


    // $ANTLR start "rule__PathElement__Alternatives"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:914:1: rule__PathElement__Alternatives : ( ( ( rule__PathElement__SimpleAssignment_0 ) ) | ( ( rule__PathElement__Group_1__0 ) ) );
    public final void rule__PathElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:918:1: ( ( ( rule__PathElement__SimpleAssignment_0 ) ) | ( ( rule__PathElement__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==33) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:919:1: ( ( rule__PathElement__SimpleAssignment_0 ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:919:1: ( ( rule__PathElement__SimpleAssignment_0 ) )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:920:1: ( rule__PathElement__SimpleAssignment_0 )
                    {
                     before(grammarAccess.getPathElementAccess().getSimpleAssignment_0()); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:921:1: ( rule__PathElement__SimpleAssignment_0 )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:921:2: rule__PathElement__SimpleAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PathElement__SimpleAssignment_0_in_rule__PathElement__Alternatives1941);
                    rule__PathElement__SimpleAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPathElementAccess().getSimpleAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:925:6: ( ( rule__PathElement__Group_1__0 ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:925:6: ( ( rule__PathElement__Group_1__0 ) )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:926:1: ( rule__PathElement__Group_1__0 )
                    {
                     before(grammarAccess.getPathElementAccess().getGroup_1()); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:927:1: ( rule__PathElement__Group_1__0 )
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:927:2: rule__PathElement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PathElement__Group_1__0_in_rule__PathElement__Alternatives1959);
                    rule__PathElement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPathElementAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__Alternatives"


    // $ANTLR start "rule__LinkSpec__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:938:1: rule__LinkSpec__Group__0 : rule__LinkSpec__Group__0__Impl rule__LinkSpec__Group__1 ;
    public final void rule__LinkSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:942:1: ( rule__LinkSpec__Group__0__Impl rule__LinkSpec__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:943:2: rule__LinkSpec__Group__0__Impl rule__LinkSpec__Group__1
            {
            pushFollow(FOLLOW_rule__LinkSpec__Group__0__Impl_in_rule__LinkSpec__Group__01990);
            rule__LinkSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinkSpec__Group__1_in_rule__LinkSpec__Group__01993);
            rule__LinkSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__Group__0"


    // $ANTLR start "rule__LinkSpec__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:950:1: rule__LinkSpec__Group__0__Impl : ( 'link' ) ;
    public final void rule__LinkSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:954:1: ( ( 'link' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:955:1: ( 'link' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:955:1: ( 'link' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:956:1: 'link'
            {
             before(grammarAccess.getLinkSpecAccess().getLinkKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__LinkSpec__Group__0__Impl2021); 
             after(grammarAccess.getLinkSpecAccess().getLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__Group__0__Impl"


    // $ANTLR start "rule__LinkSpec__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:969:1: rule__LinkSpec__Group__1 : rule__LinkSpec__Group__1__Impl rule__LinkSpec__Group__2 ;
    public final void rule__LinkSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:973:1: ( rule__LinkSpec__Group__1__Impl rule__LinkSpec__Group__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:974:2: rule__LinkSpec__Group__1__Impl rule__LinkSpec__Group__2
            {
            pushFollow(FOLLOW_rule__LinkSpec__Group__1__Impl_in_rule__LinkSpec__Group__12052);
            rule__LinkSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinkSpec__Group__2_in_rule__LinkSpec__Group__12055);
            rule__LinkSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__Group__1"


    // $ANTLR start "rule__LinkSpec__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:981:1: rule__LinkSpec__Group__1__Impl : ( ( rule__LinkSpec__NameAssignment_1 ) ) ;
    public final void rule__LinkSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:985:1: ( ( ( rule__LinkSpec__NameAssignment_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:986:1: ( ( rule__LinkSpec__NameAssignment_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:986:1: ( ( rule__LinkSpec__NameAssignment_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:987:1: ( rule__LinkSpec__NameAssignment_1 )
            {
             before(grammarAccess.getLinkSpecAccess().getNameAssignment_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:988:1: ( rule__LinkSpec__NameAssignment_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:988:2: rule__LinkSpec__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__LinkSpec__NameAssignment_1_in_rule__LinkSpec__Group__1__Impl2082);
            rule__LinkSpec__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinkSpecAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__Group__1__Impl"


    // $ANTLR start "rule__LinkSpec__Group__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:998:1: rule__LinkSpec__Group__2 : rule__LinkSpec__Group__2__Impl rule__LinkSpec__Group__3 ;
    public final void rule__LinkSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1002:1: ( rule__LinkSpec__Group__2__Impl rule__LinkSpec__Group__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1003:2: rule__LinkSpec__Group__2__Impl rule__LinkSpec__Group__3
            {
            pushFollow(FOLLOW_rule__LinkSpec__Group__2__Impl_in_rule__LinkSpec__Group__22112);
            rule__LinkSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinkSpec__Group__3_in_rule__LinkSpec__Group__22115);
            rule__LinkSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__Group__2"


    // $ANTLR start "rule__LinkSpec__Group__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1010:1: rule__LinkSpec__Group__2__Impl : ( ';' ) ;
    public final void rule__LinkSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1014:1: ( ( ';' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1015:1: ( ';' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1015:1: ( ';' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1016:1: ';'
            {
             before(grammarAccess.getLinkSpecAccess().getSemicolonKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__LinkSpec__Group__2__Impl2143); 
             after(grammarAccess.getLinkSpecAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__Group__2__Impl"


    // $ANTLR start "rule__LinkSpec__Group__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1029:1: rule__LinkSpec__Group__3 : rule__LinkSpec__Group__3__Impl ;
    public final void rule__LinkSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1033:1: ( rule__LinkSpec__Group__3__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1034:2: rule__LinkSpec__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LinkSpec__Group__3__Impl_in_rule__LinkSpec__Group__32174);
            rule__LinkSpec__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__Group__3"


    // $ANTLR start "rule__LinkSpec__Group__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1040:1: rule__LinkSpec__Group__3__Impl : ( ( rule__LinkSpec__ConstructorsAssignment_3 )* ) ;
    public final void rule__LinkSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1044:1: ( ( ( rule__LinkSpec__ConstructorsAssignment_3 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1045:1: ( ( rule__LinkSpec__ConstructorsAssignment_3 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1045:1: ( ( rule__LinkSpec__ConstructorsAssignment_3 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1046:1: ( rule__LinkSpec__ConstructorsAssignment_3 )*
            {
             before(grammarAccess.getLinkSpecAccess().getConstructorsAssignment_3()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1047:1: ( rule__LinkSpec__ConstructorsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==34) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1047:2: rule__LinkSpec__ConstructorsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__LinkSpec__ConstructorsAssignment_3_in_rule__LinkSpec__Group__3__Impl2201);
            	    rule__LinkSpec__ConstructorsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getLinkSpecAccess().getConstructorsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__Group__3__Impl"


    // $ANTLR start "rule__Constructor__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1065:1: rule__Constructor__Group__0 : rule__Constructor__Group__0__Impl rule__Constructor__Group__1 ;
    public final void rule__Constructor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1069:1: ( rule__Constructor__Group__0__Impl rule__Constructor__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1070:2: rule__Constructor__Group__0__Impl rule__Constructor__Group__1
            {
            pushFollow(FOLLOW_rule__Constructor__Group__0__Impl_in_rule__Constructor__Group__02240);
            rule__Constructor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__1_in_rule__Constructor__Group__02243);
            rule__Constructor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__0"


    // $ANTLR start "rule__Constructor__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1077:1: rule__Constructor__Group__0__Impl : ( ( rule__Constructor__IsPublicAssignment_0 )? ) ;
    public final void rule__Constructor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1081:1: ( ( ( rule__Constructor__IsPublicAssignment_0 )? ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1082:1: ( ( rule__Constructor__IsPublicAssignment_0 )? )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1082:1: ( ( rule__Constructor__IsPublicAssignment_0 )? )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1083:1: ( rule__Constructor__IsPublicAssignment_0 )?
            {
             before(grammarAccess.getConstructorAccess().getIsPublicAssignment_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1084:1: ( rule__Constructor__IsPublicAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1084:2: rule__Constructor__IsPublicAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Constructor__IsPublicAssignment_0_in_rule__Constructor__Group__0__Impl2270);
                    rule__Constructor__IsPublicAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstructorAccess().getIsPublicAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__0__Impl"


    // $ANTLR start "rule__Constructor__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1094:1: rule__Constructor__Group__1 : rule__Constructor__Group__1__Impl rule__Constructor__Group__2 ;
    public final void rule__Constructor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1098:1: ( rule__Constructor__Group__1__Impl rule__Constructor__Group__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1099:2: rule__Constructor__Group__1__Impl rule__Constructor__Group__2
            {
            pushFollow(FOLLOW_rule__Constructor__Group__1__Impl_in_rule__Constructor__Group__12301);
            rule__Constructor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__2_in_rule__Constructor__Group__12304);
            rule__Constructor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__1"


    // $ANTLR start "rule__Constructor__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1106:1: rule__Constructor__Group__1__Impl : ( ( rule__Constructor__NameAssignment_1 ) ) ;
    public final void rule__Constructor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1110:1: ( ( ( rule__Constructor__NameAssignment_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1111:1: ( ( rule__Constructor__NameAssignment_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1111:1: ( ( rule__Constructor__NameAssignment_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1112:1: ( rule__Constructor__NameAssignment_1 )
            {
             before(grammarAccess.getConstructorAccess().getNameAssignment_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1113:1: ( rule__Constructor__NameAssignment_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1113:2: rule__Constructor__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Constructor__NameAssignment_1_in_rule__Constructor__Group__1__Impl2331);
            rule__Constructor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__1__Impl"


    // $ANTLR start "rule__Constructor__Group__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1123:1: rule__Constructor__Group__2 : rule__Constructor__Group__2__Impl rule__Constructor__Group__3 ;
    public final void rule__Constructor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1127:1: ( rule__Constructor__Group__2__Impl rule__Constructor__Group__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1128:2: rule__Constructor__Group__2__Impl rule__Constructor__Group__3
            {
            pushFollow(FOLLOW_rule__Constructor__Group__2__Impl_in_rule__Constructor__Group__22361);
            rule__Constructor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__3_in_rule__Constructor__Group__22364);
            rule__Constructor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__2"


    // $ANTLR start "rule__Constructor__Group__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1135:1: rule__Constructor__Group__2__Impl : ( '(' ) ;
    public final void rule__Constructor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1139:1: ( ( '(' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1140:1: ( '(' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1140:1: ( '(' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1141:1: '('
            {
             before(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__Constructor__Group__2__Impl2392); 
             after(grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__2__Impl"


    // $ANTLR start "rule__Constructor__Group__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1154:1: rule__Constructor__Group__3 : rule__Constructor__Group__3__Impl rule__Constructor__Group__4 ;
    public final void rule__Constructor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1158:1: ( rule__Constructor__Group__3__Impl rule__Constructor__Group__4 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1159:2: rule__Constructor__Group__3__Impl rule__Constructor__Group__4
            {
            pushFollow(FOLLOW_rule__Constructor__Group__3__Impl_in_rule__Constructor__Group__32423);
            rule__Constructor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__4_in_rule__Constructor__Group__32426);
            rule__Constructor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__3"


    // $ANTLR start "rule__Constructor__Group__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1166:1: rule__Constructor__Group__3__Impl : ( ( rule__Constructor__Group_3__0 )? ) ;
    public final void rule__Constructor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1170:1: ( ( ( rule__Constructor__Group_3__0 )? ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1171:1: ( ( rule__Constructor__Group_3__0 )? )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1171:1: ( ( rule__Constructor__Group_3__0 )? )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1172:1: ( rule__Constructor__Group_3__0 )?
            {
             before(grammarAccess.getConstructorAccess().getGroup_3()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1173:1: ( rule__Constructor__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1173:2: rule__Constructor__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Constructor__Group_3__0_in_rule__Constructor__Group__3__Impl2453);
                    rule__Constructor__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstructorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__3__Impl"


    // $ANTLR start "rule__Constructor__Group__4"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1183:1: rule__Constructor__Group__4 : rule__Constructor__Group__4__Impl rule__Constructor__Group__5 ;
    public final void rule__Constructor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1187:1: ( rule__Constructor__Group__4__Impl rule__Constructor__Group__5 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1188:2: rule__Constructor__Group__4__Impl rule__Constructor__Group__5
            {
            pushFollow(FOLLOW_rule__Constructor__Group__4__Impl_in_rule__Constructor__Group__42484);
            rule__Constructor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__5_in_rule__Constructor__Group__42487);
            rule__Constructor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__4"


    // $ANTLR start "rule__Constructor__Group__4__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1195:1: rule__Constructor__Group__4__Impl : ( ')' ) ;
    public final void rule__Constructor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1199:1: ( ( ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1200:1: ( ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1200:1: ( ')' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1201:1: ')'
            {
             before(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__Constructor__Group__4__Impl2515); 
             after(grammarAccess.getConstructorAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__4__Impl"


    // $ANTLR start "rule__Constructor__Group__5"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1214:1: rule__Constructor__Group__5 : rule__Constructor__Group__5__Impl rule__Constructor__Group__6 ;
    public final void rule__Constructor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1218:1: ( rule__Constructor__Group__5__Impl rule__Constructor__Group__6 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1219:2: rule__Constructor__Group__5__Impl rule__Constructor__Group__6
            {
            pushFollow(FOLLOW_rule__Constructor__Group__5__Impl_in_rule__Constructor__Group__52546);
            rule__Constructor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__6_in_rule__Constructor__Group__52549);
            rule__Constructor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__5"


    // $ANTLR start "rule__Constructor__Group__5__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1226:1: rule__Constructor__Group__5__Impl : ( ( rule__Constructor__Group_5__0 )? ) ;
    public final void rule__Constructor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1230:1: ( ( ( rule__Constructor__Group_5__0 )? ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1231:1: ( ( rule__Constructor__Group_5__0 )? )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1231:1: ( ( rule__Constructor__Group_5__0 )? )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1232:1: ( rule__Constructor__Group_5__0 )?
            {
             before(grammarAccess.getConstructorAccess().getGroup_5()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1233:1: ( rule__Constructor__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1233:2: rule__Constructor__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Constructor__Group_5__0_in_rule__Constructor__Group__5__Impl2576);
                    rule__Constructor__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConstructorAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__5__Impl"


    // $ANTLR start "rule__Constructor__Group__6"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1243:1: rule__Constructor__Group__6 : rule__Constructor__Group__6__Impl rule__Constructor__Group__7 ;
    public final void rule__Constructor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1247:1: ( rule__Constructor__Group__6__Impl rule__Constructor__Group__7 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1248:2: rule__Constructor__Group__6__Impl rule__Constructor__Group__7
            {
            pushFollow(FOLLOW_rule__Constructor__Group__6__Impl_in_rule__Constructor__Group__62607);
            rule__Constructor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__7_in_rule__Constructor__Group__62610);
            rule__Constructor__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__6"


    // $ANTLR start "rule__Constructor__Group__6__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1255:1: rule__Constructor__Group__6__Impl : ( '{' ) ;
    public final void rule__Constructor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1259:1: ( ( '{' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1260:1: ( '{' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1260:1: ( '{' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1261:1: '{'
            {
             before(grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_18_in_rule__Constructor__Group__6__Impl2638); 
             after(grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__6__Impl"


    // $ANTLR start "rule__Constructor__Group__7"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1274:1: rule__Constructor__Group__7 : rule__Constructor__Group__7__Impl rule__Constructor__Group__8 ;
    public final void rule__Constructor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1278:1: ( rule__Constructor__Group__7__Impl rule__Constructor__Group__8 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1279:2: rule__Constructor__Group__7__Impl rule__Constructor__Group__8
            {
            pushFollow(FOLLOW_rule__Constructor__Group__7__Impl_in_rule__Constructor__Group__72669);
            rule__Constructor__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group__8_in_rule__Constructor__Group__72672);
            rule__Constructor__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__7"


    // $ANTLR start "rule__Constructor__Group__7__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1286:1: rule__Constructor__Group__7__Impl : ( ( rule__Constructor__Group_7__0 )* ) ;
    public final void rule__Constructor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1290:1: ( ( ( rule__Constructor__Group_7__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1291:1: ( ( rule__Constructor__Group_7__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1291:1: ( ( rule__Constructor__Group_7__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1292:1: ( rule__Constructor__Group_7__0 )*
            {
             before(grammarAccess.getConstructorAccess().getGroup_7()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1293:1: ( rule__Constructor__Group_7__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=22 && LA14_0<=23)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1293:2: rule__Constructor__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Constructor__Group_7__0_in_rule__Constructor__Group__7__Impl2699);
            	    rule__Constructor__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getConstructorAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__7__Impl"


    // $ANTLR start "rule__Constructor__Group__8"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1303:1: rule__Constructor__Group__8 : rule__Constructor__Group__8__Impl ;
    public final void rule__Constructor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1307:1: ( rule__Constructor__Group__8__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1308:2: rule__Constructor__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Constructor__Group__8__Impl_in_rule__Constructor__Group__82730);
            rule__Constructor__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__8"


    // $ANTLR start "rule__Constructor__Group__8__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1314:1: rule__Constructor__Group__8__Impl : ( '}' ) ;
    public final void rule__Constructor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1318:1: ( ( '}' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1319:1: ( '}' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1319:1: ( '}' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1320:1: '}'
            {
             before(grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_19_in_rule__Constructor__Group__8__Impl2758); 
             after(grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group__8__Impl"


    // $ANTLR start "rule__Constructor__Group_3__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1351:1: rule__Constructor__Group_3__0 : rule__Constructor__Group_3__0__Impl rule__Constructor__Group_3__1 ;
    public final void rule__Constructor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1355:1: ( rule__Constructor__Group_3__0__Impl rule__Constructor__Group_3__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1356:2: rule__Constructor__Group_3__0__Impl rule__Constructor__Group_3__1
            {
            pushFollow(FOLLOW_rule__Constructor__Group_3__0__Impl_in_rule__Constructor__Group_3__02807);
            rule__Constructor__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group_3__1_in_rule__Constructor__Group_3__02810);
            rule__Constructor__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_3__0"


    // $ANTLR start "rule__Constructor__Group_3__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1363:1: rule__Constructor__Group_3__0__Impl : ( ( rule__Constructor__ParametersAssignment_3_0 ) ) ;
    public final void rule__Constructor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1367:1: ( ( ( rule__Constructor__ParametersAssignment_3_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1368:1: ( ( rule__Constructor__ParametersAssignment_3_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1368:1: ( ( rule__Constructor__ParametersAssignment_3_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1369:1: ( rule__Constructor__ParametersAssignment_3_0 )
            {
             before(grammarAccess.getConstructorAccess().getParametersAssignment_3_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1370:1: ( rule__Constructor__ParametersAssignment_3_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1370:2: rule__Constructor__ParametersAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Constructor__ParametersAssignment_3_0_in_rule__Constructor__Group_3__0__Impl2837);
            rule__Constructor__ParametersAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getParametersAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_3__0__Impl"


    // $ANTLR start "rule__Constructor__Group_3__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1380:1: rule__Constructor__Group_3__1 : rule__Constructor__Group_3__1__Impl ;
    public final void rule__Constructor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1384:1: ( rule__Constructor__Group_3__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1385:2: rule__Constructor__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Constructor__Group_3__1__Impl_in_rule__Constructor__Group_3__12867);
            rule__Constructor__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_3__1"


    // $ANTLR start "rule__Constructor__Group_3__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1391:1: rule__Constructor__Group_3__1__Impl : ( ( rule__Constructor__Group_3_1__0 )* ) ;
    public final void rule__Constructor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1395:1: ( ( ( rule__Constructor__Group_3_1__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1396:1: ( ( rule__Constructor__Group_3_1__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1396:1: ( ( rule__Constructor__Group_3_1__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1397:1: ( rule__Constructor__Group_3_1__0 )*
            {
             before(grammarAccess.getConstructorAccess().getGroup_3_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1398:1: ( rule__Constructor__Group_3_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1398:2: rule__Constructor__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Constructor__Group_3_1__0_in_rule__Constructor__Group_3__1__Impl2894);
            	    rule__Constructor__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getConstructorAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_3__1__Impl"


    // $ANTLR start "rule__Constructor__Group_3_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1412:1: rule__Constructor__Group_3_1__0 : rule__Constructor__Group_3_1__0__Impl rule__Constructor__Group_3_1__1 ;
    public final void rule__Constructor__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1416:1: ( rule__Constructor__Group_3_1__0__Impl rule__Constructor__Group_3_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1417:2: rule__Constructor__Group_3_1__0__Impl rule__Constructor__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Constructor__Group_3_1__0__Impl_in_rule__Constructor__Group_3_1__02929);
            rule__Constructor__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group_3_1__1_in_rule__Constructor__Group_3_1__02932);
            rule__Constructor__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_3_1__0"


    // $ANTLR start "rule__Constructor__Group_3_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1424:1: rule__Constructor__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Constructor__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1428:1: ( ( ',' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1429:1: ( ',' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1429:1: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1430:1: ','
            {
             before(grammarAccess.getConstructorAccess().getCommaKeyword_3_1_0()); 
            match(input,20,FOLLOW_20_in_rule__Constructor__Group_3_1__0__Impl2960); 
             after(grammarAccess.getConstructorAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_3_1__0__Impl"


    // $ANTLR start "rule__Constructor__Group_3_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1443:1: rule__Constructor__Group_3_1__1 : rule__Constructor__Group_3_1__1__Impl ;
    public final void rule__Constructor__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1447:1: ( rule__Constructor__Group_3_1__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1448:2: rule__Constructor__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Constructor__Group_3_1__1__Impl_in_rule__Constructor__Group_3_1__12991);
            rule__Constructor__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_3_1__1"


    // $ANTLR start "rule__Constructor__Group_3_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1454:1: rule__Constructor__Group_3_1__1__Impl : ( ( rule__Constructor__ParametersAssignment_3_1_1 ) ) ;
    public final void rule__Constructor__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1458:1: ( ( ( rule__Constructor__ParametersAssignment_3_1_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1459:1: ( ( rule__Constructor__ParametersAssignment_3_1_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1459:1: ( ( rule__Constructor__ParametersAssignment_3_1_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1460:1: ( rule__Constructor__ParametersAssignment_3_1_1 )
            {
             before(grammarAccess.getConstructorAccess().getParametersAssignment_3_1_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1461:1: ( rule__Constructor__ParametersAssignment_3_1_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1461:2: rule__Constructor__ParametersAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Constructor__ParametersAssignment_3_1_1_in_rule__Constructor__Group_3_1__1__Impl3018);
            rule__Constructor__ParametersAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getParametersAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_3_1__1__Impl"


    // $ANTLR start "rule__Constructor__Group_5__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1475:1: rule__Constructor__Group_5__0 : rule__Constructor__Group_5__0__Impl rule__Constructor__Group_5__1 ;
    public final void rule__Constructor__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1479:1: ( rule__Constructor__Group_5__0__Impl rule__Constructor__Group_5__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1480:2: rule__Constructor__Group_5__0__Impl rule__Constructor__Group_5__1
            {
            pushFollow(FOLLOW_rule__Constructor__Group_5__0__Impl_in_rule__Constructor__Group_5__03052);
            rule__Constructor__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group_5__1_in_rule__Constructor__Group_5__03055);
            rule__Constructor__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_5__0"


    // $ANTLR start "rule__Constructor__Group_5__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1487:1: rule__Constructor__Group_5__0__Impl : ( ':' ) ;
    public final void rule__Constructor__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1491:1: ( ( ':' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1492:1: ( ':' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1492:1: ( ':' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1493:1: ':'
            {
             before(grammarAccess.getConstructorAccess().getColonKeyword_5_0()); 
            match(input,21,FOLLOW_21_in_rule__Constructor__Group_5__0__Impl3083); 
             after(grammarAccess.getConstructorAccess().getColonKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_5__0__Impl"


    // $ANTLR start "rule__Constructor__Group_5__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1506:1: rule__Constructor__Group_5__1 : rule__Constructor__Group_5__1__Impl ;
    public final void rule__Constructor__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1510:1: ( rule__Constructor__Group_5__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1511:2: rule__Constructor__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Constructor__Group_5__1__Impl_in_rule__Constructor__Group_5__13114);
            rule__Constructor__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_5__1"


    // $ANTLR start "rule__Constructor__Group_5__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1517:1: rule__Constructor__Group_5__1__Impl : ( ( rule__Constructor__AddressesAssignment_5_1 ) ) ;
    public final void rule__Constructor__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1521:1: ( ( ( rule__Constructor__AddressesAssignment_5_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1522:1: ( ( rule__Constructor__AddressesAssignment_5_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1522:1: ( ( rule__Constructor__AddressesAssignment_5_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1523:1: ( rule__Constructor__AddressesAssignment_5_1 )
            {
             before(grammarAccess.getConstructorAccess().getAddressesAssignment_5_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1524:1: ( rule__Constructor__AddressesAssignment_5_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1524:2: rule__Constructor__AddressesAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Constructor__AddressesAssignment_5_1_in_rule__Constructor__Group_5__1__Impl3141);
            rule__Constructor__AddressesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getAddressesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_5__1__Impl"


    // $ANTLR start "rule__Constructor__Group_7__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1538:1: rule__Constructor__Group_7__0 : rule__Constructor__Group_7__0__Impl rule__Constructor__Group_7__1 ;
    public final void rule__Constructor__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1542:1: ( rule__Constructor__Group_7__0__Impl rule__Constructor__Group_7__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1543:2: rule__Constructor__Group_7__0__Impl rule__Constructor__Group_7__1
            {
            pushFollow(FOLLOW_rule__Constructor__Group_7__0__Impl_in_rule__Constructor__Group_7__03175);
            rule__Constructor__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Constructor__Group_7__1_in_rule__Constructor__Group_7__03178);
            rule__Constructor__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_7__0"


    // $ANTLR start "rule__Constructor__Group_7__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1550:1: rule__Constructor__Group_7__0__Impl : ( ( rule__Constructor__MembersAssignment_7_0 ) ) ;
    public final void rule__Constructor__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1554:1: ( ( ( rule__Constructor__MembersAssignment_7_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1555:1: ( ( rule__Constructor__MembersAssignment_7_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1555:1: ( ( rule__Constructor__MembersAssignment_7_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1556:1: ( rule__Constructor__MembersAssignment_7_0 )
            {
             before(grammarAccess.getConstructorAccess().getMembersAssignment_7_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1557:1: ( rule__Constructor__MembersAssignment_7_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1557:2: rule__Constructor__MembersAssignment_7_0
            {
            pushFollow(FOLLOW_rule__Constructor__MembersAssignment_7_0_in_rule__Constructor__Group_7__0__Impl3205);
            rule__Constructor__MembersAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getConstructorAccess().getMembersAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_7__0__Impl"


    // $ANTLR start "rule__Constructor__Group_7__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1567:1: rule__Constructor__Group_7__1 : rule__Constructor__Group_7__1__Impl ;
    public final void rule__Constructor__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1571:1: ( rule__Constructor__Group_7__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1572:2: rule__Constructor__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Constructor__Group_7__1__Impl_in_rule__Constructor__Group_7__13235);
            rule__Constructor__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_7__1"


    // $ANTLR start "rule__Constructor__Group_7__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1578:1: rule__Constructor__Group_7__1__Impl : ( ';' ) ;
    public final void rule__Constructor__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1582:1: ( ( ';' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1583:1: ( ';' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1583:1: ( ';' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1584:1: ';'
            {
             before(grammarAccess.getConstructorAccess().getSemicolonKeyword_7_1()); 
            match(input,15,FOLLOW_15_in_rule__Constructor__Group_7__1__Impl3263); 
             after(grammarAccess.getConstructorAccess().getSemicolonKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__Group_7__1__Impl"


    // $ANTLR start "rule__NamedAddresses__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1601:1: rule__NamedAddresses__Group__0 : rule__NamedAddresses__Group__0__Impl rule__NamedAddresses__Group__1 ;
    public final void rule__NamedAddresses__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1605:1: ( rule__NamedAddresses__Group__0__Impl rule__NamedAddresses__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1606:2: rule__NamedAddresses__Group__0__Impl rule__NamedAddresses__Group__1
            {
            pushFollow(FOLLOW_rule__NamedAddresses__Group__0__Impl_in_rule__NamedAddresses__Group__03298);
            rule__NamedAddresses__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedAddresses__Group__1_in_rule__NamedAddresses__Group__03301);
            rule__NamedAddresses__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group__0"


    // $ANTLR start "rule__NamedAddresses__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1613:1: rule__NamedAddresses__Group__0__Impl : ( '@' ) ;
    public final void rule__NamedAddresses__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1617:1: ( ( '@' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1618:1: ( '@' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1618:1: ( '@' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1619:1: '@'
            {
             before(grammarAccess.getNamedAddressesAccess().getCommercialAtKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__NamedAddresses__Group__0__Impl3329); 
             after(grammarAccess.getNamedAddressesAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group__0__Impl"


    // $ANTLR start "rule__NamedAddresses__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1632:1: rule__NamedAddresses__Group__1 : rule__NamedAddresses__Group__1__Impl rule__NamedAddresses__Group__2 ;
    public final void rule__NamedAddresses__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1636:1: ( rule__NamedAddresses__Group__1__Impl rule__NamedAddresses__Group__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1637:2: rule__NamedAddresses__Group__1__Impl rule__NamedAddresses__Group__2
            {
            pushFollow(FOLLOW_rule__NamedAddresses__Group__1__Impl_in_rule__NamedAddresses__Group__13360);
            rule__NamedAddresses__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedAddresses__Group__2_in_rule__NamedAddresses__Group__13363);
            rule__NamedAddresses__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group__1"


    // $ANTLR start "rule__NamedAddresses__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1644:1: rule__NamedAddresses__Group__1__Impl : ( ( rule__NamedAddresses__AddressNamesAssignment_1 ) ) ;
    public final void rule__NamedAddresses__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1648:1: ( ( ( rule__NamedAddresses__AddressNamesAssignment_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1649:1: ( ( rule__NamedAddresses__AddressNamesAssignment_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1649:1: ( ( rule__NamedAddresses__AddressNamesAssignment_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1650:1: ( rule__NamedAddresses__AddressNamesAssignment_1 )
            {
             before(grammarAccess.getNamedAddressesAccess().getAddressNamesAssignment_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1651:1: ( rule__NamedAddresses__AddressNamesAssignment_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1651:2: rule__NamedAddresses__AddressNamesAssignment_1
            {
            pushFollow(FOLLOW_rule__NamedAddresses__AddressNamesAssignment_1_in_rule__NamedAddresses__Group__1__Impl3390);
            rule__NamedAddresses__AddressNamesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedAddressesAccess().getAddressNamesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group__1__Impl"


    // $ANTLR start "rule__NamedAddresses__Group__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1661:1: rule__NamedAddresses__Group__2 : rule__NamedAddresses__Group__2__Impl ;
    public final void rule__NamedAddresses__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1665:1: ( rule__NamedAddresses__Group__2__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1666:2: rule__NamedAddresses__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NamedAddresses__Group__2__Impl_in_rule__NamedAddresses__Group__23420);
            rule__NamedAddresses__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group__2"


    // $ANTLR start "rule__NamedAddresses__Group__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1672:1: rule__NamedAddresses__Group__2__Impl : ( ( rule__NamedAddresses__Group_2__0 )* ) ;
    public final void rule__NamedAddresses__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1676:1: ( ( ( rule__NamedAddresses__Group_2__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1677:1: ( ( rule__NamedAddresses__Group_2__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1677:1: ( ( rule__NamedAddresses__Group_2__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1678:1: ( rule__NamedAddresses__Group_2__0 )*
            {
             before(grammarAccess.getNamedAddressesAccess().getGroup_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1679:1: ( rule__NamedAddresses__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1679:2: rule__NamedAddresses__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__NamedAddresses__Group_2__0_in_rule__NamedAddresses__Group__2__Impl3447);
            	    rule__NamedAddresses__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getNamedAddressesAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group__2__Impl"


    // $ANTLR start "rule__NamedAddresses__Group_2__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1695:1: rule__NamedAddresses__Group_2__0 : rule__NamedAddresses__Group_2__0__Impl rule__NamedAddresses__Group_2__1 ;
    public final void rule__NamedAddresses__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1699:1: ( rule__NamedAddresses__Group_2__0__Impl rule__NamedAddresses__Group_2__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1700:2: rule__NamedAddresses__Group_2__0__Impl rule__NamedAddresses__Group_2__1
            {
            pushFollow(FOLLOW_rule__NamedAddresses__Group_2__0__Impl_in_rule__NamedAddresses__Group_2__03484);
            rule__NamedAddresses__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedAddresses__Group_2__1_in_rule__NamedAddresses__Group_2__03487);
            rule__NamedAddresses__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group_2__0"


    // $ANTLR start "rule__NamedAddresses__Group_2__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1707:1: rule__NamedAddresses__Group_2__0__Impl : ( ',' ) ;
    public final void rule__NamedAddresses__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1711:1: ( ( ',' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1712:1: ( ',' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1712:1: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1713:1: ','
            {
             before(grammarAccess.getNamedAddressesAccess().getCommaKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__NamedAddresses__Group_2__0__Impl3515); 
             after(grammarAccess.getNamedAddressesAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group_2__0__Impl"


    // $ANTLR start "rule__NamedAddresses__Group_2__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1726:1: rule__NamedAddresses__Group_2__1 : rule__NamedAddresses__Group_2__1__Impl rule__NamedAddresses__Group_2__2 ;
    public final void rule__NamedAddresses__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1730:1: ( rule__NamedAddresses__Group_2__1__Impl rule__NamedAddresses__Group_2__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1731:2: rule__NamedAddresses__Group_2__1__Impl rule__NamedAddresses__Group_2__2
            {
            pushFollow(FOLLOW_rule__NamedAddresses__Group_2__1__Impl_in_rule__NamedAddresses__Group_2__13546);
            rule__NamedAddresses__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedAddresses__Group_2__2_in_rule__NamedAddresses__Group_2__13549);
            rule__NamedAddresses__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group_2__1"


    // $ANTLR start "rule__NamedAddresses__Group_2__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1738:1: rule__NamedAddresses__Group_2__1__Impl : ( '@' ) ;
    public final void rule__NamedAddresses__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1742:1: ( ( '@' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1743:1: ( '@' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1743:1: ( '@' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1744:1: '@'
            {
             before(grammarAccess.getNamedAddressesAccess().getCommercialAtKeyword_2_1()); 
            match(input,22,FOLLOW_22_in_rule__NamedAddresses__Group_2__1__Impl3577); 
             after(grammarAccess.getNamedAddressesAccess().getCommercialAtKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group_2__1__Impl"


    // $ANTLR start "rule__NamedAddresses__Group_2__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1757:1: rule__NamedAddresses__Group_2__2 : rule__NamedAddresses__Group_2__2__Impl ;
    public final void rule__NamedAddresses__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1761:1: ( rule__NamedAddresses__Group_2__2__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1762:2: rule__NamedAddresses__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__NamedAddresses__Group_2__2__Impl_in_rule__NamedAddresses__Group_2__23608);
            rule__NamedAddresses__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group_2__2"


    // $ANTLR start "rule__NamedAddresses__Group_2__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1768:1: rule__NamedAddresses__Group_2__2__Impl : ( ( rule__NamedAddresses__AddressNamesAssignment_2_2 ) ) ;
    public final void rule__NamedAddresses__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1772:1: ( ( ( rule__NamedAddresses__AddressNamesAssignment_2_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1773:1: ( ( rule__NamedAddresses__AddressNamesAssignment_2_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1773:1: ( ( rule__NamedAddresses__AddressNamesAssignment_2_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1774:1: ( rule__NamedAddresses__AddressNamesAssignment_2_2 )
            {
             before(grammarAccess.getNamedAddressesAccess().getAddressNamesAssignment_2_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1775:1: ( rule__NamedAddresses__AddressNamesAssignment_2_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1775:2: rule__NamedAddresses__AddressNamesAssignment_2_2
            {
            pushFollow(FOLLOW_rule__NamedAddresses__AddressNamesAssignment_2_2_in_rule__NamedAddresses__Group_2__2__Impl3635);
            rule__NamedAddresses__AddressNamesAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getNamedAddressesAccess().getAddressNamesAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__Group_2__2__Impl"


    // $ANTLR start "rule__AddressTuple__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1791:1: rule__AddressTuple__Group__0 : rule__AddressTuple__Group__0__Impl rule__AddressTuple__Group__1 ;
    public final void rule__AddressTuple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1795:1: ( rule__AddressTuple__Group__0__Impl rule__AddressTuple__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1796:2: rule__AddressTuple__Group__0__Impl rule__AddressTuple__Group__1
            {
            pushFollow(FOLLOW_rule__AddressTuple__Group__0__Impl_in_rule__AddressTuple__Group__03671);
            rule__AddressTuple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressTuple__Group__1_in_rule__AddressTuple__Group__03674);
            rule__AddressTuple__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group__0"


    // $ANTLR start "rule__AddressTuple__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1803:1: rule__AddressTuple__Group__0__Impl : ( '@' ) ;
    public final void rule__AddressTuple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1807:1: ( ( '@' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1808:1: ( '@' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1808:1: ( '@' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1809:1: '@'
            {
             before(grammarAccess.getAddressTupleAccess().getCommercialAtKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__AddressTuple__Group__0__Impl3702); 
             after(grammarAccess.getAddressTupleAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group__0__Impl"


    // $ANTLR start "rule__AddressTuple__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1822:1: rule__AddressTuple__Group__1 : rule__AddressTuple__Group__1__Impl rule__AddressTuple__Group__2 ;
    public final void rule__AddressTuple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1826:1: ( rule__AddressTuple__Group__1__Impl rule__AddressTuple__Group__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1827:2: rule__AddressTuple__Group__1__Impl rule__AddressTuple__Group__2
            {
            pushFollow(FOLLOW_rule__AddressTuple__Group__1__Impl_in_rule__AddressTuple__Group__13733);
            rule__AddressTuple__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressTuple__Group__2_in_rule__AddressTuple__Group__13736);
            rule__AddressTuple__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group__1"


    // $ANTLR start "rule__AddressTuple__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1834:1: rule__AddressTuple__Group__1__Impl : ( '(' ) ;
    public final void rule__AddressTuple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1838:1: ( ( '(' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1839:1: ( '(' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1839:1: ( '(' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1840:1: '('
            {
             before(grammarAccess.getAddressTupleAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__AddressTuple__Group__1__Impl3764); 
             after(grammarAccess.getAddressTupleAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group__1__Impl"


    // $ANTLR start "rule__AddressTuple__Group__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1853:1: rule__AddressTuple__Group__2 : rule__AddressTuple__Group__2__Impl rule__AddressTuple__Group__3 ;
    public final void rule__AddressTuple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1857:1: ( rule__AddressTuple__Group__2__Impl rule__AddressTuple__Group__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1858:2: rule__AddressTuple__Group__2__Impl rule__AddressTuple__Group__3
            {
            pushFollow(FOLLOW_rule__AddressTuple__Group__2__Impl_in_rule__AddressTuple__Group__23795);
            rule__AddressTuple__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressTuple__Group__3_in_rule__AddressTuple__Group__23798);
            rule__AddressTuple__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group__2"


    // $ANTLR start "rule__AddressTuple__Group__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1865:1: rule__AddressTuple__Group__2__Impl : ( ( rule__AddressTuple__ElementsAssignment_2 ) ) ;
    public final void rule__AddressTuple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1869:1: ( ( ( rule__AddressTuple__ElementsAssignment_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1870:1: ( ( rule__AddressTuple__ElementsAssignment_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1870:1: ( ( rule__AddressTuple__ElementsAssignment_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1871:1: ( rule__AddressTuple__ElementsAssignment_2 )
            {
             before(grammarAccess.getAddressTupleAccess().getElementsAssignment_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1872:1: ( rule__AddressTuple__ElementsAssignment_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1872:2: rule__AddressTuple__ElementsAssignment_2
            {
            pushFollow(FOLLOW_rule__AddressTuple__ElementsAssignment_2_in_rule__AddressTuple__Group__2__Impl3825);
            rule__AddressTuple__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAddressTupleAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group__2__Impl"


    // $ANTLR start "rule__AddressTuple__Group__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1882:1: rule__AddressTuple__Group__3 : rule__AddressTuple__Group__3__Impl rule__AddressTuple__Group__4 ;
    public final void rule__AddressTuple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1886:1: ( rule__AddressTuple__Group__3__Impl rule__AddressTuple__Group__4 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1887:2: rule__AddressTuple__Group__3__Impl rule__AddressTuple__Group__4
            {
            pushFollow(FOLLOW_rule__AddressTuple__Group__3__Impl_in_rule__AddressTuple__Group__33855);
            rule__AddressTuple__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressTuple__Group__4_in_rule__AddressTuple__Group__33858);
            rule__AddressTuple__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group__3"


    // $ANTLR start "rule__AddressTuple__Group__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1894:1: rule__AddressTuple__Group__3__Impl : ( ( rule__AddressTuple__Group_3__0 )* ) ;
    public final void rule__AddressTuple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1898:1: ( ( ( rule__AddressTuple__Group_3__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1899:1: ( ( rule__AddressTuple__Group_3__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1899:1: ( ( rule__AddressTuple__Group_3__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1900:1: ( rule__AddressTuple__Group_3__0 )*
            {
             before(grammarAccess.getAddressTupleAccess().getGroup_3()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1901:1: ( rule__AddressTuple__Group_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==20) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1901:2: rule__AddressTuple__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__AddressTuple__Group_3__0_in_rule__AddressTuple__Group__3__Impl3885);
            	    rule__AddressTuple__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getAddressTupleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group__3__Impl"


    // $ANTLR start "rule__AddressTuple__Group__4"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1911:1: rule__AddressTuple__Group__4 : rule__AddressTuple__Group__4__Impl ;
    public final void rule__AddressTuple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1915:1: ( rule__AddressTuple__Group__4__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1916:2: rule__AddressTuple__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AddressTuple__Group__4__Impl_in_rule__AddressTuple__Group__43916);
            rule__AddressTuple__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group__4"


    // $ANTLR start "rule__AddressTuple__Group__4__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1922:1: rule__AddressTuple__Group__4__Impl : ( ')' ) ;
    public final void rule__AddressTuple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1926:1: ( ( ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1927:1: ( ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1927:1: ( ')' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1928:1: ')'
            {
             before(grammarAccess.getAddressTupleAccess().getRightParenthesisKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__AddressTuple__Group__4__Impl3944); 
             after(grammarAccess.getAddressTupleAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group__4__Impl"


    // $ANTLR start "rule__AddressTuple__Group_3__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1951:1: rule__AddressTuple__Group_3__0 : rule__AddressTuple__Group_3__0__Impl rule__AddressTuple__Group_3__1 ;
    public final void rule__AddressTuple__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1955:1: ( rule__AddressTuple__Group_3__0__Impl rule__AddressTuple__Group_3__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1956:2: rule__AddressTuple__Group_3__0__Impl rule__AddressTuple__Group_3__1
            {
            pushFollow(FOLLOW_rule__AddressTuple__Group_3__0__Impl_in_rule__AddressTuple__Group_3__03985);
            rule__AddressTuple__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressTuple__Group_3__1_in_rule__AddressTuple__Group_3__03988);
            rule__AddressTuple__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group_3__0"


    // $ANTLR start "rule__AddressTuple__Group_3__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1963:1: rule__AddressTuple__Group_3__0__Impl : ( ',' ) ;
    public final void rule__AddressTuple__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1967:1: ( ( ',' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1968:1: ( ',' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1968:1: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1969:1: ','
            {
             before(grammarAccess.getAddressTupleAccess().getCommaKeyword_3_0()); 
            match(input,20,FOLLOW_20_in_rule__AddressTuple__Group_3__0__Impl4016); 
             after(grammarAccess.getAddressTupleAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group_3__0__Impl"


    // $ANTLR start "rule__AddressTuple__Group_3__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1982:1: rule__AddressTuple__Group_3__1 : rule__AddressTuple__Group_3__1__Impl ;
    public final void rule__AddressTuple__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1986:1: ( rule__AddressTuple__Group_3__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1987:2: rule__AddressTuple__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__AddressTuple__Group_3__1__Impl_in_rule__AddressTuple__Group_3__14047);
            rule__AddressTuple__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group_3__1"


    // $ANTLR start "rule__AddressTuple__Group_3__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1993:1: rule__AddressTuple__Group_3__1__Impl : ( ( rule__AddressTuple__ElementsAssignment_3_1 ) ) ;
    public final void rule__AddressTuple__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1997:1: ( ( ( rule__AddressTuple__ElementsAssignment_3_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1998:1: ( ( rule__AddressTuple__ElementsAssignment_3_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1998:1: ( ( rule__AddressTuple__ElementsAssignment_3_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1999:1: ( rule__AddressTuple__ElementsAssignment_3_1 )
            {
             before(grammarAccess.getAddressTupleAccess().getElementsAssignment_3_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2000:1: ( rule__AddressTuple__ElementsAssignment_3_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2000:2: rule__AddressTuple__ElementsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__AddressTuple__ElementsAssignment_3_1_in_rule__AddressTuple__Group_3__1__Impl4074);
            rule__AddressTuple__ElementsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAddressTupleAccess().getElementsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__Group_3__1__Impl"


    // $ANTLR start "rule__TosNetLinkBinding__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2014:1: rule__TosNetLinkBinding__Group__0 : rule__TosNetLinkBinding__Group__0__Impl rule__TosNetLinkBinding__Group__1 ;
    public final void rule__TosNetLinkBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2018:1: ( rule__TosNetLinkBinding__Group__0__Impl rule__TosNetLinkBinding__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2019:2: rule__TosNetLinkBinding__Group__0__Impl rule__TosNetLinkBinding__Group__1
            {
            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group__0__Impl_in_rule__TosNetLinkBinding__Group__04108);
            rule__TosNetLinkBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group__1_in_rule__TosNetLinkBinding__Group__04111);
            rule__TosNetLinkBinding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group__0"


    // $ANTLR start "rule__TosNetLinkBinding__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2026:1: rule__TosNetLinkBinding__Group__0__Impl : ( 'TOSNET' ) ;
    public final void rule__TosNetLinkBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2030:1: ( ( 'TOSNET' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2031:1: ( 'TOSNET' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2031:1: ( 'TOSNET' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2032:1: 'TOSNET'
            {
             before(grammarAccess.getTosNetLinkBindingAccess().getTOSNETKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__TosNetLinkBinding__Group__0__Impl4139); 
             after(grammarAccess.getTosNetLinkBindingAccess().getTOSNETKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group__0__Impl"


    // $ANTLR start "rule__TosNetLinkBinding__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2045:1: rule__TosNetLinkBinding__Group__1 : rule__TosNetLinkBinding__Group__1__Impl rule__TosNetLinkBinding__Group__2 ;
    public final void rule__TosNetLinkBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2049:1: ( rule__TosNetLinkBinding__Group__1__Impl rule__TosNetLinkBinding__Group__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2050:2: rule__TosNetLinkBinding__Group__1__Impl rule__TosNetLinkBinding__Group__2
            {
            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group__1__Impl_in_rule__TosNetLinkBinding__Group__14170);
            rule__TosNetLinkBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group__2_in_rule__TosNetLinkBinding__Group__14173);
            rule__TosNetLinkBinding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group__1"


    // $ANTLR start "rule__TosNetLinkBinding__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2057:1: rule__TosNetLinkBinding__Group__1__Impl : ( '(' ) ;
    public final void rule__TosNetLinkBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2061:1: ( ( '(' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2062:1: ( '(' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2062:1: ( '(' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2063:1: '('
            {
             before(grammarAccess.getTosNetLinkBindingAccess().getLeftParenthesisKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__TosNetLinkBinding__Group__1__Impl4201); 
             after(grammarAccess.getTosNetLinkBindingAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group__1__Impl"


    // $ANTLR start "rule__TosNetLinkBinding__Group__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2076:1: rule__TosNetLinkBinding__Group__2 : rule__TosNetLinkBinding__Group__2__Impl rule__TosNetLinkBinding__Group__3 ;
    public final void rule__TosNetLinkBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2080:1: ( rule__TosNetLinkBinding__Group__2__Impl rule__TosNetLinkBinding__Group__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2081:2: rule__TosNetLinkBinding__Group__2__Impl rule__TosNetLinkBinding__Group__3
            {
            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group__2__Impl_in_rule__TosNetLinkBinding__Group__24232);
            rule__TosNetLinkBinding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group__3_in_rule__TosNetLinkBinding__Group__24235);
            rule__TosNetLinkBinding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group__2"


    // $ANTLR start "rule__TosNetLinkBinding__Group__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2088:1: rule__TosNetLinkBinding__Group__2__Impl : ( ( rule__TosNetLinkBinding__PropertiesAssignment_2 ) ) ;
    public final void rule__TosNetLinkBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2092:1: ( ( ( rule__TosNetLinkBinding__PropertiesAssignment_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2093:1: ( ( rule__TosNetLinkBinding__PropertiesAssignment_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2093:1: ( ( rule__TosNetLinkBinding__PropertiesAssignment_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2094:1: ( rule__TosNetLinkBinding__PropertiesAssignment_2 )
            {
             before(grammarAccess.getTosNetLinkBindingAccess().getPropertiesAssignment_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2095:1: ( rule__TosNetLinkBinding__PropertiesAssignment_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2095:2: rule__TosNetLinkBinding__PropertiesAssignment_2
            {
            pushFollow(FOLLOW_rule__TosNetLinkBinding__PropertiesAssignment_2_in_rule__TosNetLinkBinding__Group__2__Impl4262);
            rule__TosNetLinkBinding__PropertiesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTosNetLinkBindingAccess().getPropertiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group__2__Impl"


    // $ANTLR start "rule__TosNetLinkBinding__Group__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2105:1: rule__TosNetLinkBinding__Group__3 : rule__TosNetLinkBinding__Group__3__Impl rule__TosNetLinkBinding__Group__4 ;
    public final void rule__TosNetLinkBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2109:1: ( rule__TosNetLinkBinding__Group__3__Impl rule__TosNetLinkBinding__Group__4 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2110:2: rule__TosNetLinkBinding__Group__3__Impl rule__TosNetLinkBinding__Group__4
            {
            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group__3__Impl_in_rule__TosNetLinkBinding__Group__34292);
            rule__TosNetLinkBinding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group__4_in_rule__TosNetLinkBinding__Group__34295);
            rule__TosNetLinkBinding__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group__3"


    // $ANTLR start "rule__TosNetLinkBinding__Group__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2117:1: rule__TosNetLinkBinding__Group__3__Impl : ( ( rule__TosNetLinkBinding__Group_3__0 )* ) ;
    public final void rule__TosNetLinkBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2121:1: ( ( ( rule__TosNetLinkBinding__Group_3__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2122:1: ( ( rule__TosNetLinkBinding__Group_3__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2122:1: ( ( rule__TosNetLinkBinding__Group_3__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2123:1: ( rule__TosNetLinkBinding__Group_3__0 )*
            {
             before(grammarAccess.getTosNetLinkBindingAccess().getGroup_3()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2124:1: ( rule__TosNetLinkBinding__Group_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2124:2: rule__TosNetLinkBinding__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__TosNetLinkBinding__Group_3__0_in_rule__TosNetLinkBinding__Group__3__Impl4322);
            	    rule__TosNetLinkBinding__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getTosNetLinkBindingAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group__3__Impl"


    // $ANTLR start "rule__TosNetLinkBinding__Group__4"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2134:1: rule__TosNetLinkBinding__Group__4 : rule__TosNetLinkBinding__Group__4__Impl ;
    public final void rule__TosNetLinkBinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2138:1: ( rule__TosNetLinkBinding__Group__4__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2139:2: rule__TosNetLinkBinding__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group__4__Impl_in_rule__TosNetLinkBinding__Group__44353);
            rule__TosNetLinkBinding__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group__4"


    // $ANTLR start "rule__TosNetLinkBinding__Group__4__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2145:1: rule__TosNetLinkBinding__Group__4__Impl : ( ')' ) ;
    public final void rule__TosNetLinkBinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2149:1: ( ( ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2150:1: ( ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2150:1: ( ')' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2151:1: ')'
            {
             before(grammarAccess.getTosNetLinkBindingAccess().getRightParenthesisKeyword_4()); 
            match(input,17,FOLLOW_17_in_rule__TosNetLinkBinding__Group__4__Impl4381); 
             after(grammarAccess.getTosNetLinkBindingAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group__4__Impl"


    // $ANTLR start "rule__TosNetLinkBinding__Group_3__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2174:1: rule__TosNetLinkBinding__Group_3__0 : rule__TosNetLinkBinding__Group_3__0__Impl rule__TosNetLinkBinding__Group_3__1 ;
    public final void rule__TosNetLinkBinding__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2178:1: ( rule__TosNetLinkBinding__Group_3__0__Impl rule__TosNetLinkBinding__Group_3__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2179:2: rule__TosNetLinkBinding__Group_3__0__Impl rule__TosNetLinkBinding__Group_3__1
            {
            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group_3__0__Impl_in_rule__TosNetLinkBinding__Group_3__04422);
            rule__TosNetLinkBinding__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group_3__1_in_rule__TosNetLinkBinding__Group_3__04425);
            rule__TosNetLinkBinding__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group_3__0"


    // $ANTLR start "rule__TosNetLinkBinding__Group_3__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2186:1: rule__TosNetLinkBinding__Group_3__0__Impl : ( ',' ) ;
    public final void rule__TosNetLinkBinding__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2190:1: ( ( ',' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2191:1: ( ',' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2191:1: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2192:1: ','
            {
             before(grammarAccess.getTosNetLinkBindingAccess().getCommaKeyword_3_0()); 
            match(input,20,FOLLOW_20_in_rule__TosNetLinkBinding__Group_3__0__Impl4453); 
             after(grammarAccess.getTosNetLinkBindingAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group_3__0__Impl"


    // $ANTLR start "rule__TosNetLinkBinding__Group_3__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2205:1: rule__TosNetLinkBinding__Group_3__1 : rule__TosNetLinkBinding__Group_3__1__Impl ;
    public final void rule__TosNetLinkBinding__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2209:1: ( rule__TosNetLinkBinding__Group_3__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2210:2: rule__TosNetLinkBinding__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__TosNetLinkBinding__Group_3__1__Impl_in_rule__TosNetLinkBinding__Group_3__14484);
            rule__TosNetLinkBinding__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group_3__1"


    // $ANTLR start "rule__TosNetLinkBinding__Group_3__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2216:1: rule__TosNetLinkBinding__Group_3__1__Impl : ( ( rule__TosNetLinkBinding__PropertiesAssignment_3_1 ) ) ;
    public final void rule__TosNetLinkBinding__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2220:1: ( ( ( rule__TosNetLinkBinding__PropertiesAssignment_3_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2221:1: ( ( rule__TosNetLinkBinding__PropertiesAssignment_3_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2221:1: ( ( rule__TosNetLinkBinding__PropertiesAssignment_3_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2222:1: ( rule__TosNetLinkBinding__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getTosNetLinkBindingAccess().getPropertiesAssignment_3_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2223:1: ( rule__TosNetLinkBinding__PropertiesAssignment_3_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2223:2: rule__TosNetLinkBinding__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TosNetLinkBinding__PropertiesAssignment_3_1_in_rule__TosNetLinkBinding__Group_3__1__Impl4511);
            rule__TosNetLinkBinding__PropertiesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTosNetLinkBindingAccess().getPropertiesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__Group_3__1__Impl"


    // $ANTLR start "rule__LinkProperty__Group_0__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2237:1: rule__LinkProperty__Group_0__0 : rule__LinkProperty__Group_0__0__Impl rule__LinkProperty__Group_0__1 ;
    public final void rule__LinkProperty__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2241:1: ( rule__LinkProperty__Group_0__0__Impl rule__LinkProperty__Group_0__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2242:2: rule__LinkProperty__Group_0__0__Impl rule__LinkProperty__Group_0__1
            {
            pushFollow(FOLLOW_rule__LinkProperty__Group_0__0__Impl_in_rule__LinkProperty__Group_0__04545);
            rule__LinkProperty__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinkProperty__Group_0__1_in_rule__LinkProperty__Group_0__04548);
            rule__LinkProperty__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_0__0"


    // $ANTLR start "rule__LinkProperty__Group_0__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2249:1: rule__LinkProperty__Group_0__0__Impl : ( 'CTRL' ) ;
    public final void rule__LinkProperty__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2253:1: ( ( 'CTRL' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2254:1: ( 'CTRL' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2254:1: ( 'CTRL' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2255:1: 'CTRL'
            {
             before(grammarAccess.getLinkPropertyAccess().getCTRLKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__LinkProperty__Group_0__0__Impl4576); 
             after(grammarAccess.getLinkPropertyAccess().getCTRLKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_0__0__Impl"


    // $ANTLR start "rule__LinkProperty__Group_0__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2268:1: rule__LinkProperty__Group_0__1 : rule__LinkProperty__Group_0__1__Impl rule__LinkProperty__Group_0__2 ;
    public final void rule__LinkProperty__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2272:1: ( rule__LinkProperty__Group_0__1__Impl rule__LinkProperty__Group_0__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2273:2: rule__LinkProperty__Group_0__1__Impl rule__LinkProperty__Group_0__2
            {
            pushFollow(FOLLOW_rule__LinkProperty__Group_0__1__Impl_in_rule__LinkProperty__Group_0__14607);
            rule__LinkProperty__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinkProperty__Group_0__2_in_rule__LinkProperty__Group_0__14610);
            rule__LinkProperty__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_0__1"


    // $ANTLR start "rule__LinkProperty__Group_0__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2280:1: rule__LinkProperty__Group_0__1__Impl : ( '=' ) ;
    public final void rule__LinkProperty__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2284:1: ( ( '=' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2285:1: ( '=' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2285:1: ( '=' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2286:1: '='
            {
             before(grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_0_1()); 
            match(input,25,FOLLOW_25_in_rule__LinkProperty__Group_0__1__Impl4638); 
             after(grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_0__1__Impl"


    // $ANTLR start "rule__LinkProperty__Group_0__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2299:1: rule__LinkProperty__Group_0__2 : rule__LinkProperty__Group_0__2__Impl ;
    public final void rule__LinkProperty__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2303:1: ( rule__LinkProperty__Group_0__2__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2304:2: rule__LinkProperty__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__LinkProperty__Group_0__2__Impl_in_rule__LinkProperty__Group_0__24669);
            rule__LinkProperty__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_0__2"


    // $ANTLR start "rule__LinkProperty__Group_0__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2310:1: rule__LinkProperty__Group_0__2__Impl : ( ( rule__LinkProperty__CtrlNameAssignment_0_2 ) ) ;
    public final void rule__LinkProperty__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2314:1: ( ( ( rule__LinkProperty__CtrlNameAssignment_0_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2315:1: ( ( rule__LinkProperty__CtrlNameAssignment_0_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2315:1: ( ( rule__LinkProperty__CtrlNameAssignment_0_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2316:1: ( rule__LinkProperty__CtrlNameAssignment_0_2 )
            {
             before(grammarAccess.getLinkPropertyAccess().getCtrlNameAssignment_0_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2317:1: ( rule__LinkProperty__CtrlNameAssignment_0_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2317:2: rule__LinkProperty__CtrlNameAssignment_0_2
            {
            pushFollow(FOLLOW_rule__LinkProperty__CtrlNameAssignment_0_2_in_rule__LinkProperty__Group_0__2__Impl4696);
            rule__LinkProperty__CtrlNameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkPropertyAccess().getCtrlNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_0__2__Impl"


    // $ANTLR start "rule__LinkProperty__Group_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2333:1: rule__LinkProperty__Group_1__0 : rule__LinkProperty__Group_1__0__Impl rule__LinkProperty__Group_1__1 ;
    public final void rule__LinkProperty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2337:1: ( rule__LinkProperty__Group_1__0__Impl rule__LinkProperty__Group_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2338:2: rule__LinkProperty__Group_1__0__Impl rule__LinkProperty__Group_1__1
            {
            pushFollow(FOLLOW_rule__LinkProperty__Group_1__0__Impl_in_rule__LinkProperty__Group_1__04732);
            rule__LinkProperty__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinkProperty__Group_1__1_in_rule__LinkProperty__Group_1__04735);
            rule__LinkProperty__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_1__0"


    // $ANTLR start "rule__LinkProperty__Group_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2345:1: rule__LinkProperty__Group_1__0__Impl : ( 'BASE' ) ;
    public final void rule__LinkProperty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2349:1: ( ( 'BASE' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2350:1: ( 'BASE' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2350:1: ( 'BASE' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2351:1: 'BASE'
            {
             before(grammarAccess.getLinkPropertyAccess().getBASEKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__LinkProperty__Group_1__0__Impl4763); 
             after(grammarAccess.getLinkPropertyAccess().getBASEKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_1__0__Impl"


    // $ANTLR start "rule__LinkProperty__Group_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2364:1: rule__LinkProperty__Group_1__1 : rule__LinkProperty__Group_1__1__Impl rule__LinkProperty__Group_1__2 ;
    public final void rule__LinkProperty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2368:1: ( rule__LinkProperty__Group_1__1__Impl rule__LinkProperty__Group_1__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2369:2: rule__LinkProperty__Group_1__1__Impl rule__LinkProperty__Group_1__2
            {
            pushFollow(FOLLOW_rule__LinkProperty__Group_1__1__Impl_in_rule__LinkProperty__Group_1__14794);
            rule__LinkProperty__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinkProperty__Group_1__2_in_rule__LinkProperty__Group_1__14797);
            rule__LinkProperty__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_1__1"


    // $ANTLR start "rule__LinkProperty__Group_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2376:1: rule__LinkProperty__Group_1__1__Impl : ( '=' ) ;
    public final void rule__LinkProperty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2380:1: ( ( '=' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2381:1: ( '=' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2381:1: ( '=' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2382:1: '='
            {
             before(grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_1_1()); 
            match(input,25,FOLLOW_25_in_rule__LinkProperty__Group_1__1__Impl4825); 
             after(grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_1__1__Impl"


    // $ANTLR start "rule__LinkProperty__Group_1__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2395:1: rule__LinkProperty__Group_1__2 : rule__LinkProperty__Group_1__2__Impl ;
    public final void rule__LinkProperty__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2399:1: ( rule__LinkProperty__Group_1__2__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2400:2: rule__LinkProperty__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__LinkProperty__Group_1__2__Impl_in_rule__LinkProperty__Group_1__24856);
            rule__LinkProperty__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_1__2"


    // $ANTLR start "rule__LinkProperty__Group_1__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2406:1: rule__LinkProperty__Group_1__2__Impl : ( ( rule__LinkProperty__BaseValueAssignment_1_2 ) ) ;
    public final void rule__LinkProperty__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2410:1: ( ( ( rule__LinkProperty__BaseValueAssignment_1_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2411:1: ( ( rule__LinkProperty__BaseValueAssignment_1_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2411:1: ( ( rule__LinkProperty__BaseValueAssignment_1_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2412:1: ( rule__LinkProperty__BaseValueAssignment_1_2 )
            {
             before(grammarAccess.getLinkPropertyAccess().getBaseValueAssignment_1_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2413:1: ( rule__LinkProperty__BaseValueAssignment_1_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2413:2: rule__LinkProperty__BaseValueAssignment_1_2
            {
            pushFollow(FOLLOW_rule__LinkProperty__BaseValueAssignment_1_2_in_rule__LinkProperty__Group_1__2__Impl4883);
            rule__LinkProperty__BaseValueAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkPropertyAccess().getBaseValueAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_1__2__Impl"


    // $ANTLR start "rule__LinkProperty__Group_2__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2429:1: rule__LinkProperty__Group_2__0 : rule__LinkProperty__Group_2__0__Impl rule__LinkProperty__Group_2__1 ;
    public final void rule__LinkProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2433:1: ( rule__LinkProperty__Group_2__0__Impl rule__LinkProperty__Group_2__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2434:2: rule__LinkProperty__Group_2__0__Impl rule__LinkProperty__Group_2__1
            {
            pushFollow(FOLLOW_rule__LinkProperty__Group_2__0__Impl_in_rule__LinkProperty__Group_2__04919);
            rule__LinkProperty__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinkProperty__Group_2__1_in_rule__LinkProperty__Group_2__04922);
            rule__LinkProperty__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_2__0"


    // $ANTLR start "rule__LinkProperty__Group_2__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2441:1: rule__LinkProperty__Group_2__0__Impl : ( 'UART' ) ;
    public final void rule__LinkProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2445:1: ( ( 'UART' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2446:1: ( 'UART' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2446:1: ( 'UART' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2447:1: 'UART'
            {
             before(grammarAccess.getLinkPropertyAccess().getUARTKeyword_2_0()); 
            match(input,27,FOLLOW_27_in_rule__LinkProperty__Group_2__0__Impl4950); 
             after(grammarAccess.getLinkPropertyAccess().getUARTKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_2__0__Impl"


    // $ANTLR start "rule__LinkProperty__Group_2__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2460:1: rule__LinkProperty__Group_2__1 : rule__LinkProperty__Group_2__1__Impl rule__LinkProperty__Group_2__2 ;
    public final void rule__LinkProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2464:1: ( rule__LinkProperty__Group_2__1__Impl rule__LinkProperty__Group_2__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2465:2: rule__LinkProperty__Group_2__1__Impl rule__LinkProperty__Group_2__2
            {
            pushFollow(FOLLOW_rule__LinkProperty__Group_2__1__Impl_in_rule__LinkProperty__Group_2__14981);
            rule__LinkProperty__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LinkProperty__Group_2__2_in_rule__LinkProperty__Group_2__14984);
            rule__LinkProperty__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_2__1"


    // $ANTLR start "rule__LinkProperty__Group_2__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2472:1: rule__LinkProperty__Group_2__1__Impl : ( '=' ) ;
    public final void rule__LinkProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2476:1: ( ( '=' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2477:1: ( '=' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2477:1: ( '=' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2478:1: '='
            {
             before(grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_2_1()); 
            match(input,25,FOLLOW_25_in_rule__LinkProperty__Group_2__1__Impl5012); 
             after(grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_2__1__Impl"


    // $ANTLR start "rule__LinkProperty__Group_2__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2491:1: rule__LinkProperty__Group_2__2 : rule__LinkProperty__Group_2__2__Impl ;
    public final void rule__LinkProperty__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2495:1: ( rule__LinkProperty__Group_2__2__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2496:2: rule__LinkProperty__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__LinkProperty__Group_2__2__Impl_in_rule__LinkProperty__Group_2__25043);
            rule__LinkProperty__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_2__2"


    // $ANTLR start "rule__LinkProperty__Group_2__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2502:1: rule__LinkProperty__Group_2__2__Impl : ( ( rule__LinkProperty__UartNameAssignment_2_2 ) ) ;
    public final void rule__LinkProperty__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2506:1: ( ( ( rule__LinkProperty__UartNameAssignment_2_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2507:1: ( ( rule__LinkProperty__UartNameAssignment_2_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2507:1: ( ( rule__LinkProperty__UartNameAssignment_2_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2508:1: ( rule__LinkProperty__UartNameAssignment_2_2 )
            {
             before(grammarAccess.getLinkPropertyAccess().getUartNameAssignment_2_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2509:1: ( rule__LinkProperty__UartNameAssignment_2_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2509:2: rule__LinkProperty__UartNameAssignment_2_2
            {
            pushFollow(FOLLOW_rule__LinkProperty__UartNameAssignment_2_2_in_rule__LinkProperty__Group_2__2__Impl5070);
            rule__LinkProperty__UartNameAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getLinkPropertyAccess().getUartNameAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__Group_2__2__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2525:1: rule__SimpleExpansion__Group__0 : rule__SimpleExpansion__Group__0__Impl rule__SimpleExpansion__Group__1 ;
    public final void rule__SimpleExpansion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2529:1: ( rule__SimpleExpansion__Group__0__Impl rule__SimpleExpansion__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2530:2: rule__SimpleExpansion__Group__0__Impl rule__SimpleExpansion__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group__0__Impl_in_rule__SimpleExpansion__Group__05106);
            rule__SimpleExpansion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpansion__Group__1_in_rule__SimpleExpansion__Group__05109);
            rule__SimpleExpansion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__0"


    // $ANTLR start "rule__SimpleExpansion__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2537:1: rule__SimpleExpansion__Group__0__Impl : ( ( rule__SimpleExpansion__NameAssignment_0 ) ) ;
    public final void rule__SimpleExpansion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2541:1: ( ( ( rule__SimpleExpansion__NameAssignment_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2542:1: ( ( rule__SimpleExpansion__NameAssignment_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2542:1: ( ( rule__SimpleExpansion__NameAssignment_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2543:1: ( rule__SimpleExpansion__NameAssignment_0 )
            {
             before(grammarAccess.getSimpleExpansionAccess().getNameAssignment_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2544:1: ( rule__SimpleExpansion__NameAssignment_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2544:2: rule__SimpleExpansion__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__NameAssignment_0_in_rule__SimpleExpansion__Group__0__Impl5136);
            rule__SimpleExpansion__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleExpansionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__0__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2554:1: rule__SimpleExpansion__Group__1 : rule__SimpleExpansion__Group__1__Impl rule__SimpleExpansion__Group__2 ;
    public final void rule__SimpleExpansion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2558:1: ( rule__SimpleExpansion__Group__1__Impl rule__SimpleExpansion__Group__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2559:2: rule__SimpleExpansion__Group__1__Impl rule__SimpleExpansion__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group__1__Impl_in_rule__SimpleExpansion__Group__15166);
            rule__SimpleExpansion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpansion__Group__2_in_rule__SimpleExpansion__Group__15169);
            rule__SimpleExpansion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__1"


    // $ANTLR start "rule__SimpleExpansion__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2566:1: rule__SimpleExpansion__Group__1__Impl : ( ':' ) ;
    public final void rule__SimpleExpansion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2570:1: ( ( ':' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2571:1: ( ':' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2571:1: ( ':' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2572:1: ':'
            {
             before(grammarAccess.getSimpleExpansionAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__SimpleExpansion__Group__1__Impl5197); 
             after(grammarAccess.getSimpleExpansionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__1__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2585:1: rule__SimpleExpansion__Group__2 : rule__SimpleExpansion__Group__2__Impl rule__SimpleExpansion__Group__3 ;
    public final void rule__SimpleExpansion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2589:1: ( rule__SimpleExpansion__Group__2__Impl rule__SimpleExpansion__Group__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2590:2: rule__SimpleExpansion__Group__2__Impl rule__SimpleExpansion__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group__2__Impl_in_rule__SimpleExpansion__Group__25228);
            rule__SimpleExpansion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpansion__Group__3_in_rule__SimpleExpansion__Group__25231);
            rule__SimpleExpansion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__2"


    // $ANTLR start "rule__SimpleExpansion__Group__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2597:1: rule__SimpleExpansion__Group__2__Impl : ( ( rule__SimpleExpansion__ConstructorAssignment_2 ) ) ;
    public final void rule__SimpleExpansion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2601:1: ( ( ( rule__SimpleExpansion__ConstructorAssignment_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2602:1: ( ( rule__SimpleExpansion__ConstructorAssignment_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2602:1: ( ( rule__SimpleExpansion__ConstructorAssignment_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2603:1: ( rule__SimpleExpansion__ConstructorAssignment_2 )
            {
             before(grammarAccess.getSimpleExpansionAccess().getConstructorAssignment_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2604:1: ( rule__SimpleExpansion__ConstructorAssignment_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2604:2: rule__SimpleExpansion__ConstructorAssignment_2
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__ConstructorAssignment_2_in_rule__SimpleExpansion__Group__2__Impl5258);
            rule__SimpleExpansion__ConstructorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleExpansionAccess().getConstructorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__2__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2614:1: rule__SimpleExpansion__Group__3 : rule__SimpleExpansion__Group__3__Impl rule__SimpleExpansion__Group__4 ;
    public final void rule__SimpleExpansion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2618:1: ( rule__SimpleExpansion__Group__3__Impl rule__SimpleExpansion__Group__4 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2619:2: rule__SimpleExpansion__Group__3__Impl rule__SimpleExpansion__Group__4
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group__3__Impl_in_rule__SimpleExpansion__Group__35288);
            rule__SimpleExpansion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpansion__Group__4_in_rule__SimpleExpansion__Group__35291);
            rule__SimpleExpansion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__3"


    // $ANTLR start "rule__SimpleExpansion__Group__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2626:1: rule__SimpleExpansion__Group__3__Impl : ( '(' ) ;
    public final void rule__SimpleExpansion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2630:1: ( ( '(' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2631:1: ( '(' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2631:1: ( '(' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2632:1: '('
            {
             before(grammarAccess.getSimpleExpansionAccess().getLeftParenthesisKeyword_3()); 
            match(input,16,FOLLOW_16_in_rule__SimpleExpansion__Group__3__Impl5319); 
             after(grammarAccess.getSimpleExpansionAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__3__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group__4"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2645:1: rule__SimpleExpansion__Group__4 : rule__SimpleExpansion__Group__4__Impl rule__SimpleExpansion__Group__5 ;
    public final void rule__SimpleExpansion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2649:1: ( rule__SimpleExpansion__Group__4__Impl rule__SimpleExpansion__Group__5 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2650:2: rule__SimpleExpansion__Group__4__Impl rule__SimpleExpansion__Group__5
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group__4__Impl_in_rule__SimpleExpansion__Group__45350);
            rule__SimpleExpansion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpansion__Group__5_in_rule__SimpleExpansion__Group__45353);
            rule__SimpleExpansion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__4"


    // $ANTLR start "rule__SimpleExpansion__Group__4__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2657:1: rule__SimpleExpansion__Group__4__Impl : ( ( rule__SimpleExpansion__Group_4__0 )? ) ;
    public final void rule__SimpleExpansion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2661:1: ( ( ( rule__SimpleExpansion__Group_4__0 )? ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2662:1: ( ( rule__SimpleExpansion__Group_4__0 )? )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2662:1: ( ( rule__SimpleExpansion__Group_4__0 )? )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2663:1: ( rule__SimpleExpansion__Group_4__0 )?
            {
             before(grammarAccess.getSimpleExpansionAccess().getGroup_4()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2664:1: ( rule__SimpleExpansion__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2664:2: rule__SimpleExpansion__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__SimpleExpansion__Group_4__0_in_rule__SimpleExpansion__Group__4__Impl5380);
                    rule__SimpleExpansion__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleExpansionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__4__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group__5"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2674:1: rule__SimpleExpansion__Group__5 : rule__SimpleExpansion__Group__5__Impl rule__SimpleExpansion__Group__6 ;
    public final void rule__SimpleExpansion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2678:1: ( rule__SimpleExpansion__Group__5__Impl rule__SimpleExpansion__Group__6 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2679:2: rule__SimpleExpansion__Group__5__Impl rule__SimpleExpansion__Group__6
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group__5__Impl_in_rule__SimpleExpansion__Group__55411);
            rule__SimpleExpansion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpansion__Group__6_in_rule__SimpleExpansion__Group__55414);
            rule__SimpleExpansion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__5"


    // $ANTLR start "rule__SimpleExpansion__Group__5__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2686:1: rule__SimpleExpansion__Group__5__Impl : ( ')' ) ;
    public final void rule__SimpleExpansion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2690:1: ( ( ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2691:1: ( ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2691:1: ( ')' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2692:1: ')'
            {
             before(grammarAccess.getSimpleExpansionAccess().getRightParenthesisKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__SimpleExpansion__Group__5__Impl5442); 
             after(grammarAccess.getSimpleExpansionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__5__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group__6"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2705:1: rule__SimpleExpansion__Group__6 : rule__SimpleExpansion__Group__6__Impl ;
    public final void rule__SimpleExpansion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2709:1: ( rule__SimpleExpansion__Group__6__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2710:2: rule__SimpleExpansion__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group__6__Impl_in_rule__SimpleExpansion__Group__65473);
            rule__SimpleExpansion__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__6"


    // $ANTLR start "rule__SimpleExpansion__Group__6__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2716:1: rule__SimpleExpansion__Group__6__Impl : ( ( rule__SimpleExpansion__Group_6__0 )? ) ;
    public final void rule__SimpleExpansion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2720:1: ( ( ( rule__SimpleExpansion__Group_6__0 )? ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2721:1: ( ( rule__SimpleExpansion__Group_6__0 )? )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2721:1: ( ( rule__SimpleExpansion__Group_6__0 )? )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2722:1: ( rule__SimpleExpansion__Group_6__0 )?
            {
             before(grammarAccess.getSimpleExpansionAccess().getGroup_6()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2723:1: ( rule__SimpleExpansion__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2723:2: rule__SimpleExpansion__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__SimpleExpansion__Group_6__0_in_rule__SimpleExpansion__Group__6__Impl5500);
                    rule__SimpleExpansion__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleExpansionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group__6__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group_4__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2747:1: rule__SimpleExpansion__Group_4__0 : rule__SimpleExpansion__Group_4__0__Impl rule__SimpleExpansion__Group_4__1 ;
    public final void rule__SimpleExpansion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2751:1: ( rule__SimpleExpansion__Group_4__0__Impl rule__SimpleExpansion__Group_4__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2752:2: rule__SimpleExpansion__Group_4__0__Impl rule__SimpleExpansion__Group_4__1
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group_4__0__Impl_in_rule__SimpleExpansion__Group_4__05545);
            rule__SimpleExpansion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpansion__Group_4__1_in_rule__SimpleExpansion__Group_4__05548);
            rule__SimpleExpansion__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_4__0"


    // $ANTLR start "rule__SimpleExpansion__Group_4__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2759:1: rule__SimpleExpansion__Group_4__0__Impl : ( ( rule__SimpleExpansion__ArgumentsAssignment_4_0 ) ) ;
    public final void rule__SimpleExpansion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2763:1: ( ( ( rule__SimpleExpansion__ArgumentsAssignment_4_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2764:1: ( ( rule__SimpleExpansion__ArgumentsAssignment_4_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2764:1: ( ( rule__SimpleExpansion__ArgumentsAssignment_4_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2765:1: ( rule__SimpleExpansion__ArgumentsAssignment_4_0 )
            {
             before(grammarAccess.getSimpleExpansionAccess().getArgumentsAssignment_4_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2766:1: ( rule__SimpleExpansion__ArgumentsAssignment_4_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2766:2: rule__SimpleExpansion__ArgumentsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__ArgumentsAssignment_4_0_in_rule__SimpleExpansion__Group_4__0__Impl5575);
            rule__SimpleExpansion__ArgumentsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleExpansionAccess().getArgumentsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_4__0__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group_4__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2776:1: rule__SimpleExpansion__Group_4__1 : rule__SimpleExpansion__Group_4__1__Impl ;
    public final void rule__SimpleExpansion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2780:1: ( rule__SimpleExpansion__Group_4__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2781:2: rule__SimpleExpansion__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group_4__1__Impl_in_rule__SimpleExpansion__Group_4__15605);
            rule__SimpleExpansion__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_4__1"


    // $ANTLR start "rule__SimpleExpansion__Group_4__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2787:1: rule__SimpleExpansion__Group_4__1__Impl : ( ( rule__SimpleExpansion__Group_4_1__0 )* ) ;
    public final void rule__SimpleExpansion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2791:1: ( ( ( rule__SimpleExpansion__Group_4_1__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2792:1: ( ( rule__SimpleExpansion__Group_4_1__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2792:1: ( ( rule__SimpleExpansion__Group_4_1__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2793:1: ( rule__SimpleExpansion__Group_4_1__0 )*
            {
             before(grammarAccess.getSimpleExpansionAccess().getGroup_4_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2794:1: ( rule__SimpleExpansion__Group_4_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==20) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2794:2: rule__SimpleExpansion__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SimpleExpansion__Group_4_1__0_in_rule__SimpleExpansion__Group_4__1__Impl5632);
            	    rule__SimpleExpansion__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getSimpleExpansionAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_4__1__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group_4_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2808:1: rule__SimpleExpansion__Group_4_1__0 : rule__SimpleExpansion__Group_4_1__0__Impl rule__SimpleExpansion__Group_4_1__1 ;
    public final void rule__SimpleExpansion__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2812:1: ( rule__SimpleExpansion__Group_4_1__0__Impl rule__SimpleExpansion__Group_4_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2813:2: rule__SimpleExpansion__Group_4_1__0__Impl rule__SimpleExpansion__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group_4_1__0__Impl_in_rule__SimpleExpansion__Group_4_1__05667);
            rule__SimpleExpansion__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpansion__Group_4_1__1_in_rule__SimpleExpansion__Group_4_1__05670);
            rule__SimpleExpansion__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_4_1__0"


    // $ANTLR start "rule__SimpleExpansion__Group_4_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2820:1: rule__SimpleExpansion__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__SimpleExpansion__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2824:1: ( ( ',' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2825:1: ( ',' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2825:1: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2826:1: ','
            {
             before(grammarAccess.getSimpleExpansionAccess().getCommaKeyword_4_1_0()); 
            match(input,20,FOLLOW_20_in_rule__SimpleExpansion__Group_4_1__0__Impl5698); 
             after(grammarAccess.getSimpleExpansionAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_4_1__0__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group_4_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2839:1: rule__SimpleExpansion__Group_4_1__1 : rule__SimpleExpansion__Group_4_1__1__Impl ;
    public final void rule__SimpleExpansion__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2843:1: ( rule__SimpleExpansion__Group_4_1__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2844:2: rule__SimpleExpansion__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group_4_1__1__Impl_in_rule__SimpleExpansion__Group_4_1__15729);
            rule__SimpleExpansion__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_4_1__1"


    // $ANTLR start "rule__SimpleExpansion__Group_4_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2850:1: rule__SimpleExpansion__Group_4_1__1__Impl : ( ( rule__SimpleExpansion__ArgumentsAssignment_4_1_1 ) ) ;
    public final void rule__SimpleExpansion__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2854:1: ( ( ( rule__SimpleExpansion__ArgumentsAssignment_4_1_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2855:1: ( ( rule__SimpleExpansion__ArgumentsAssignment_4_1_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2855:1: ( ( rule__SimpleExpansion__ArgumentsAssignment_4_1_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2856:1: ( rule__SimpleExpansion__ArgumentsAssignment_4_1_1 )
            {
             before(grammarAccess.getSimpleExpansionAccess().getArgumentsAssignment_4_1_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2857:1: ( rule__SimpleExpansion__ArgumentsAssignment_4_1_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2857:2: rule__SimpleExpansion__ArgumentsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__ArgumentsAssignment_4_1_1_in_rule__SimpleExpansion__Group_4_1__1__Impl5756);
            rule__SimpleExpansion__ArgumentsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleExpansionAccess().getArgumentsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_4_1__1__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group_6__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2871:1: rule__SimpleExpansion__Group_6__0 : rule__SimpleExpansion__Group_6__0__Impl rule__SimpleExpansion__Group_6__1 ;
    public final void rule__SimpleExpansion__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2875:1: ( rule__SimpleExpansion__Group_6__0__Impl rule__SimpleExpansion__Group_6__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2876:2: rule__SimpleExpansion__Group_6__0__Impl rule__SimpleExpansion__Group_6__1
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group_6__0__Impl_in_rule__SimpleExpansion__Group_6__05790);
            rule__SimpleExpansion__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpansion__Group_6__1_in_rule__SimpleExpansion__Group_6__05793);
            rule__SimpleExpansion__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_6__0"


    // $ANTLR start "rule__SimpleExpansion__Group_6__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2883:1: rule__SimpleExpansion__Group_6__0__Impl : ( ( rule__SimpleExpansion__BindingsAssignment_6_0 ) ) ;
    public final void rule__SimpleExpansion__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2887:1: ( ( ( rule__SimpleExpansion__BindingsAssignment_6_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2888:1: ( ( rule__SimpleExpansion__BindingsAssignment_6_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2888:1: ( ( rule__SimpleExpansion__BindingsAssignment_6_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2889:1: ( rule__SimpleExpansion__BindingsAssignment_6_0 )
            {
             before(grammarAccess.getSimpleExpansionAccess().getBindingsAssignment_6_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2890:1: ( rule__SimpleExpansion__BindingsAssignment_6_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2890:2: rule__SimpleExpansion__BindingsAssignment_6_0
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__BindingsAssignment_6_0_in_rule__SimpleExpansion__Group_6__0__Impl5820);
            rule__SimpleExpansion__BindingsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleExpansionAccess().getBindingsAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_6__0__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group_6__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2900:1: rule__SimpleExpansion__Group_6__1 : rule__SimpleExpansion__Group_6__1__Impl ;
    public final void rule__SimpleExpansion__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2904:1: ( rule__SimpleExpansion__Group_6__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2905:2: rule__SimpleExpansion__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group_6__1__Impl_in_rule__SimpleExpansion__Group_6__15850);
            rule__SimpleExpansion__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_6__1"


    // $ANTLR start "rule__SimpleExpansion__Group_6__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2911:1: rule__SimpleExpansion__Group_6__1__Impl : ( ( rule__SimpleExpansion__Group_6_1__0 )* ) ;
    public final void rule__SimpleExpansion__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2915:1: ( ( ( rule__SimpleExpansion__Group_6_1__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2916:1: ( ( rule__SimpleExpansion__Group_6_1__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2916:1: ( ( rule__SimpleExpansion__Group_6_1__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2917:1: ( rule__SimpleExpansion__Group_6_1__0 )*
            {
             before(grammarAccess.getSimpleExpansionAccess().getGroup_6_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2918:1: ( rule__SimpleExpansion__Group_6_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==20) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2918:2: rule__SimpleExpansion__Group_6_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SimpleExpansion__Group_6_1__0_in_rule__SimpleExpansion__Group_6__1__Impl5877);
            	    rule__SimpleExpansion__Group_6_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getSimpleExpansionAccess().getGroup_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_6__1__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group_6_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2932:1: rule__SimpleExpansion__Group_6_1__0 : rule__SimpleExpansion__Group_6_1__0__Impl rule__SimpleExpansion__Group_6_1__1 ;
    public final void rule__SimpleExpansion__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2936:1: ( rule__SimpleExpansion__Group_6_1__0__Impl rule__SimpleExpansion__Group_6_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2937:2: rule__SimpleExpansion__Group_6_1__0__Impl rule__SimpleExpansion__Group_6_1__1
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group_6_1__0__Impl_in_rule__SimpleExpansion__Group_6_1__05912);
            rule__SimpleExpansion__Group_6_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleExpansion__Group_6_1__1_in_rule__SimpleExpansion__Group_6_1__05915);
            rule__SimpleExpansion__Group_6_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_6_1__0"


    // $ANTLR start "rule__SimpleExpansion__Group_6_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2944:1: rule__SimpleExpansion__Group_6_1__0__Impl : ( ',' ) ;
    public final void rule__SimpleExpansion__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2948:1: ( ( ',' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2949:1: ( ',' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2949:1: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2950:1: ','
            {
             before(grammarAccess.getSimpleExpansionAccess().getCommaKeyword_6_1_0()); 
            match(input,20,FOLLOW_20_in_rule__SimpleExpansion__Group_6_1__0__Impl5943); 
             after(grammarAccess.getSimpleExpansionAccess().getCommaKeyword_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_6_1__0__Impl"


    // $ANTLR start "rule__SimpleExpansion__Group_6_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2963:1: rule__SimpleExpansion__Group_6_1__1 : rule__SimpleExpansion__Group_6_1__1__Impl ;
    public final void rule__SimpleExpansion__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2967:1: ( rule__SimpleExpansion__Group_6_1__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2968:2: rule__SimpleExpansion__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__Group_6_1__1__Impl_in_rule__SimpleExpansion__Group_6_1__15974);
            rule__SimpleExpansion__Group_6_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_6_1__1"


    // $ANTLR start "rule__SimpleExpansion__Group_6_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2974:1: rule__SimpleExpansion__Group_6_1__1__Impl : ( ( rule__SimpleExpansion__BindingsAssignment_6_1_1 ) ) ;
    public final void rule__SimpleExpansion__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2978:1: ( ( ( rule__SimpleExpansion__BindingsAssignment_6_1_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2979:1: ( ( rule__SimpleExpansion__BindingsAssignment_6_1_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2979:1: ( ( rule__SimpleExpansion__BindingsAssignment_6_1_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2980:1: ( rule__SimpleExpansion__BindingsAssignment_6_1_1 )
            {
             before(grammarAccess.getSimpleExpansionAccess().getBindingsAssignment_6_1_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2981:1: ( rule__SimpleExpansion__BindingsAssignment_6_1_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2981:2: rule__SimpleExpansion__BindingsAssignment_6_1_1
            {
            pushFollow(FOLLOW_rule__SimpleExpansion__BindingsAssignment_6_1_1_in_rule__SimpleExpansion__Group_6_1__1__Impl6001);
            rule__SimpleExpansion__BindingsAssignment_6_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleExpansionAccess().getBindingsAssignment_6_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__Group_6_1__1__Impl"


    // $ANTLR start "rule__AddressExpansion__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2995:1: rule__AddressExpansion__Group__0 : rule__AddressExpansion__Group__0__Impl rule__AddressExpansion__Group__1 ;
    public final void rule__AddressExpansion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:2999:1: ( rule__AddressExpansion__Group__0__Impl rule__AddressExpansion__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3000:2: rule__AddressExpansion__Group__0__Impl rule__AddressExpansion__Group__1
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group__0__Impl_in_rule__AddressExpansion__Group__06035);
            rule__AddressExpansion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressExpansion__Group__1_in_rule__AddressExpansion__Group__06038);
            rule__AddressExpansion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__0"


    // $ANTLR start "rule__AddressExpansion__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3007:1: rule__AddressExpansion__Group__0__Impl : ( '@' ) ;
    public final void rule__AddressExpansion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3011:1: ( ( '@' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3012:1: ( '@' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3012:1: ( '@' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3013:1: '@'
            {
             before(grammarAccess.getAddressExpansionAccess().getCommercialAtKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__AddressExpansion__Group__0__Impl6066); 
             after(grammarAccess.getAddressExpansionAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__0__Impl"


    // $ANTLR start "rule__AddressExpansion__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3026:1: rule__AddressExpansion__Group__1 : rule__AddressExpansion__Group__1__Impl rule__AddressExpansion__Group__2 ;
    public final void rule__AddressExpansion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3030:1: ( rule__AddressExpansion__Group__1__Impl rule__AddressExpansion__Group__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3031:2: rule__AddressExpansion__Group__1__Impl rule__AddressExpansion__Group__2
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group__1__Impl_in_rule__AddressExpansion__Group__16097);
            rule__AddressExpansion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressExpansion__Group__2_in_rule__AddressExpansion__Group__16100);
            rule__AddressExpansion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__1"


    // $ANTLR start "rule__AddressExpansion__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3038:1: rule__AddressExpansion__Group__1__Impl : ( ( rule__AddressExpansion__NameAssignment_1 ) ) ;
    public final void rule__AddressExpansion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3042:1: ( ( ( rule__AddressExpansion__NameAssignment_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3043:1: ( ( rule__AddressExpansion__NameAssignment_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3043:1: ( ( rule__AddressExpansion__NameAssignment_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3044:1: ( rule__AddressExpansion__NameAssignment_1 )
            {
             before(grammarAccess.getAddressExpansionAccess().getNameAssignment_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3045:1: ( rule__AddressExpansion__NameAssignment_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3045:2: rule__AddressExpansion__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AddressExpansion__NameAssignment_1_in_rule__AddressExpansion__Group__1__Impl6127);
            rule__AddressExpansion__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddressExpansionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__1__Impl"


    // $ANTLR start "rule__AddressExpansion__Group__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3055:1: rule__AddressExpansion__Group__2 : rule__AddressExpansion__Group__2__Impl rule__AddressExpansion__Group__3 ;
    public final void rule__AddressExpansion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3059:1: ( rule__AddressExpansion__Group__2__Impl rule__AddressExpansion__Group__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3060:2: rule__AddressExpansion__Group__2__Impl rule__AddressExpansion__Group__3
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group__2__Impl_in_rule__AddressExpansion__Group__26157);
            rule__AddressExpansion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressExpansion__Group__3_in_rule__AddressExpansion__Group__26160);
            rule__AddressExpansion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__2"


    // $ANTLR start "rule__AddressExpansion__Group__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3067:1: rule__AddressExpansion__Group__2__Impl : ( ':' ) ;
    public final void rule__AddressExpansion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3071:1: ( ( ':' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3072:1: ( ':' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3072:1: ( ':' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3073:1: ':'
            {
             before(grammarAccess.getAddressExpansionAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__AddressExpansion__Group__2__Impl6188); 
             after(grammarAccess.getAddressExpansionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__2__Impl"


    // $ANTLR start "rule__AddressExpansion__Group__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3086:1: rule__AddressExpansion__Group__3 : rule__AddressExpansion__Group__3__Impl rule__AddressExpansion__Group__4 ;
    public final void rule__AddressExpansion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3090:1: ( rule__AddressExpansion__Group__3__Impl rule__AddressExpansion__Group__4 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3091:2: rule__AddressExpansion__Group__3__Impl rule__AddressExpansion__Group__4
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group__3__Impl_in_rule__AddressExpansion__Group__36219);
            rule__AddressExpansion__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressExpansion__Group__4_in_rule__AddressExpansion__Group__36222);
            rule__AddressExpansion__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__3"


    // $ANTLR start "rule__AddressExpansion__Group__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3098:1: rule__AddressExpansion__Group__3__Impl : ( ( rule__AddressExpansion__ConstructorAssignment_3 ) ) ;
    public final void rule__AddressExpansion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3102:1: ( ( ( rule__AddressExpansion__ConstructorAssignment_3 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3103:1: ( ( rule__AddressExpansion__ConstructorAssignment_3 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3103:1: ( ( rule__AddressExpansion__ConstructorAssignment_3 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3104:1: ( rule__AddressExpansion__ConstructorAssignment_3 )
            {
             before(grammarAccess.getAddressExpansionAccess().getConstructorAssignment_3()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3105:1: ( rule__AddressExpansion__ConstructorAssignment_3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3105:2: rule__AddressExpansion__ConstructorAssignment_3
            {
            pushFollow(FOLLOW_rule__AddressExpansion__ConstructorAssignment_3_in_rule__AddressExpansion__Group__3__Impl6249);
            rule__AddressExpansion__ConstructorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddressExpansionAccess().getConstructorAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__3__Impl"


    // $ANTLR start "rule__AddressExpansion__Group__4"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3115:1: rule__AddressExpansion__Group__4 : rule__AddressExpansion__Group__4__Impl rule__AddressExpansion__Group__5 ;
    public final void rule__AddressExpansion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3119:1: ( rule__AddressExpansion__Group__4__Impl rule__AddressExpansion__Group__5 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3120:2: rule__AddressExpansion__Group__4__Impl rule__AddressExpansion__Group__5
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group__4__Impl_in_rule__AddressExpansion__Group__46279);
            rule__AddressExpansion__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressExpansion__Group__5_in_rule__AddressExpansion__Group__46282);
            rule__AddressExpansion__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__4"


    // $ANTLR start "rule__AddressExpansion__Group__4__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3127:1: rule__AddressExpansion__Group__4__Impl : ( '(' ) ;
    public final void rule__AddressExpansion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3131:1: ( ( '(' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3132:1: ( '(' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3132:1: ( '(' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3133:1: '('
            {
             before(grammarAccess.getAddressExpansionAccess().getLeftParenthesisKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__AddressExpansion__Group__4__Impl6310); 
             after(grammarAccess.getAddressExpansionAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__4__Impl"


    // $ANTLR start "rule__AddressExpansion__Group__5"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3146:1: rule__AddressExpansion__Group__5 : rule__AddressExpansion__Group__5__Impl rule__AddressExpansion__Group__6 ;
    public final void rule__AddressExpansion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3150:1: ( rule__AddressExpansion__Group__5__Impl rule__AddressExpansion__Group__6 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3151:2: rule__AddressExpansion__Group__5__Impl rule__AddressExpansion__Group__6
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group__5__Impl_in_rule__AddressExpansion__Group__56341);
            rule__AddressExpansion__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressExpansion__Group__6_in_rule__AddressExpansion__Group__56344);
            rule__AddressExpansion__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__5"


    // $ANTLR start "rule__AddressExpansion__Group__5__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3158:1: rule__AddressExpansion__Group__5__Impl : ( ( rule__AddressExpansion__Group_5__0 )? ) ;
    public final void rule__AddressExpansion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3162:1: ( ( ( rule__AddressExpansion__Group_5__0 )? ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3163:1: ( ( rule__AddressExpansion__Group_5__0 )? )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3163:1: ( ( rule__AddressExpansion__Group_5__0 )? )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3164:1: ( rule__AddressExpansion__Group_5__0 )?
            {
             before(grammarAccess.getAddressExpansionAccess().getGroup_5()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3165:1: ( rule__AddressExpansion__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID||LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3165:2: rule__AddressExpansion__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__AddressExpansion__Group_5__0_in_rule__AddressExpansion__Group__5__Impl6371);
                    rule__AddressExpansion__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddressExpansionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__5__Impl"


    // $ANTLR start "rule__AddressExpansion__Group__6"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3175:1: rule__AddressExpansion__Group__6 : rule__AddressExpansion__Group__6__Impl ;
    public final void rule__AddressExpansion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3179:1: ( rule__AddressExpansion__Group__6__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3180:2: rule__AddressExpansion__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group__6__Impl_in_rule__AddressExpansion__Group__66402);
            rule__AddressExpansion__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__6"


    // $ANTLR start "rule__AddressExpansion__Group__6__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3186:1: rule__AddressExpansion__Group__6__Impl : ( ')' ) ;
    public final void rule__AddressExpansion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3190:1: ( ( ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3191:1: ( ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3191:1: ( ')' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3192:1: ')'
            {
             before(grammarAccess.getAddressExpansionAccess().getRightParenthesisKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__AddressExpansion__Group__6__Impl6430); 
             after(grammarAccess.getAddressExpansionAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group__6__Impl"


    // $ANTLR start "rule__AddressExpansion__Group_5__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3219:1: rule__AddressExpansion__Group_5__0 : rule__AddressExpansion__Group_5__0__Impl rule__AddressExpansion__Group_5__1 ;
    public final void rule__AddressExpansion__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3223:1: ( rule__AddressExpansion__Group_5__0__Impl rule__AddressExpansion__Group_5__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3224:2: rule__AddressExpansion__Group_5__0__Impl rule__AddressExpansion__Group_5__1
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group_5__0__Impl_in_rule__AddressExpansion__Group_5__06475);
            rule__AddressExpansion__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressExpansion__Group_5__1_in_rule__AddressExpansion__Group_5__06478);
            rule__AddressExpansion__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group_5__0"


    // $ANTLR start "rule__AddressExpansion__Group_5__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3231:1: rule__AddressExpansion__Group_5__0__Impl : ( ( rule__AddressExpansion__ArgumentsAssignment_5_0 ) ) ;
    public final void rule__AddressExpansion__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3235:1: ( ( ( rule__AddressExpansion__ArgumentsAssignment_5_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3236:1: ( ( rule__AddressExpansion__ArgumentsAssignment_5_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3236:1: ( ( rule__AddressExpansion__ArgumentsAssignment_5_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3237:1: ( rule__AddressExpansion__ArgumentsAssignment_5_0 )
            {
             before(grammarAccess.getAddressExpansionAccess().getArgumentsAssignment_5_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3238:1: ( rule__AddressExpansion__ArgumentsAssignment_5_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3238:2: rule__AddressExpansion__ArgumentsAssignment_5_0
            {
            pushFollow(FOLLOW_rule__AddressExpansion__ArgumentsAssignment_5_0_in_rule__AddressExpansion__Group_5__0__Impl6505);
            rule__AddressExpansion__ArgumentsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getAddressExpansionAccess().getArgumentsAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group_5__0__Impl"


    // $ANTLR start "rule__AddressExpansion__Group_5__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3248:1: rule__AddressExpansion__Group_5__1 : rule__AddressExpansion__Group_5__1__Impl ;
    public final void rule__AddressExpansion__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3252:1: ( rule__AddressExpansion__Group_5__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3253:2: rule__AddressExpansion__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group_5__1__Impl_in_rule__AddressExpansion__Group_5__16535);
            rule__AddressExpansion__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group_5__1"


    // $ANTLR start "rule__AddressExpansion__Group_5__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3259:1: rule__AddressExpansion__Group_5__1__Impl : ( ( rule__AddressExpansion__Group_5_1__0 )* ) ;
    public final void rule__AddressExpansion__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3263:1: ( ( ( rule__AddressExpansion__Group_5_1__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3264:1: ( ( rule__AddressExpansion__Group_5_1__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3264:1: ( ( rule__AddressExpansion__Group_5_1__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3265:1: ( rule__AddressExpansion__Group_5_1__0 )*
            {
             before(grammarAccess.getAddressExpansionAccess().getGroup_5_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3266:1: ( rule__AddressExpansion__Group_5_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==20) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3266:2: rule__AddressExpansion__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AddressExpansion__Group_5_1__0_in_rule__AddressExpansion__Group_5__1__Impl6562);
            	    rule__AddressExpansion__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getAddressExpansionAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group_5__1__Impl"


    // $ANTLR start "rule__AddressExpansion__Group_5_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3280:1: rule__AddressExpansion__Group_5_1__0 : rule__AddressExpansion__Group_5_1__0__Impl rule__AddressExpansion__Group_5_1__1 ;
    public final void rule__AddressExpansion__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3284:1: ( rule__AddressExpansion__Group_5_1__0__Impl rule__AddressExpansion__Group_5_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3285:2: rule__AddressExpansion__Group_5_1__0__Impl rule__AddressExpansion__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group_5_1__0__Impl_in_rule__AddressExpansion__Group_5_1__06597);
            rule__AddressExpansion__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressExpansion__Group_5_1__1_in_rule__AddressExpansion__Group_5_1__06600);
            rule__AddressExpansion__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group_5_1__0"


    // $ANTLR start "rule__AddressExpansion__Group_5_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3292:1: rule__AddressExpansion__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__AddressExpansion__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3296:1: ( ( ',' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3297:1: ( ',' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3297:1: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3298:1: ','
            {
             before(grammarAccess.getAddressExpansionAccess().getCommaKeyword_5_1_0()); 
            match(input,20,FOLLOW_20_in_rule__AddressExpansion__Group_5_1__0__Impl6628); 
             after(grammarAccess.getAddressExpansionAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group_5_1__0__Impl"


    // $ANTLR start "rule__AddressExpansion__Group_5_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3311:1: rule__AddressExpansion__Group_5_1__1 : rule__AddressExpansion__Group_5_1__1__Impl ;
    public final void rule__AddressExpansion__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3315:1: ( rule__AddressExpansion__Group_5_1__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3316:2: rule__AddressExpansion__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AddressExpansion__Group_5_1__1__Impl_in_rule__AddressExpansion__Group_5_1__16659);
            rule__AddressExpansion__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group_5_1__1"


    // $ANTLR start "rule__AddressExpansion__Group_5_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3322:1: rule__AddressExpansion__Group_5_1__1__Impl : ( ( rule__AddressExpansion__ArgumentsAssignment_5_1_1 ) ) ;
    public final void rule__AddressExpansion__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3326:1: ( ( ( rule__AddressExpansion__ArgumentsAssignment_5_1_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3327:1: ( ( rule__AddressExpansion__ArgumentsAssignment_5_1_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3327:1: ( ( rule__AddressExpansion__ArgumentsAssignment_5_1_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3328:1: ( rule__AddressExpansion__ArgumentsAssignment_5_1_1 )
            {
             before(grammarAccess.getAddressExpansionAccess().getArgumentsAssignment_5_1_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3329:1: ( rule__AddressExpansion__ArgumentsAssignment_5_1_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3329:2: rule__AddressExpansion__ArgumentsAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__AddressExpansion__ArgumentsAssignment_5_1_1_in_rule__AddressExpansion__Group_5_1__1__Impl6686);
            rule__AddressExpansion__ArgumentsAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAddressExpansionAccess().getArgumentsAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__Group_5_1__1__Impl"


    // $ANTLR start "rule__Argument__Group_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3343:1: rule__Argument__Group_1__0 : rule__Argument__Group_1__0__Impl rule__Argument__Group_1__1 ;
    public final void rule__Argument__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3347:1: ( rule__Argument__Group_1__0__Impl rule__Argument__Group_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3348:2: rule__Argument__Group_1__0__Impl rule__Argument__Group_1__1
            {
            pushFollow(FOLLOW_rule__Argument__Group_1__0__Impl_in_rule__Argument__Group_1__06720);
            rule__Argument__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_1__1_in_rule__Argument__Group_1__06723);
            rule__Argument__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_1__0"


    // $ANTLR start "rule__Argument__Group_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3355:1: rule__Argument__Group_1__0__Impl : ( ( rule__Argument__LhsAssignment_1_0 ) ) ;
    public final void rule__Argument__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3359:1: ( ( ( rule__Argument__LhsAssignment_1_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3360:1: ( ( rule__Argument__LhsAssignment_1_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3360:1: ( ( rule__Argument__LhsAssignment_1_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3361:1: ( rule__Argument__LhsAssignment_1_0 )
            {
             before(grammarAccess.getArgumentAccess().getLhsAssignment_1_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3362:1: ( rule__Argument__LhsAssignment_1_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3362:2: rule__Argument__LhsAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Argument__LhsAssignment_1_0_in_rule__Argument__Group_1__0__Impl6750);
            rule__Argument__LhsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getLhsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_1__0__Impl"


    // $ANTLR start "rule__Argument__Group_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3372:1: rule__Argument__Group_1__1 : rule__Argument__Group_1__1__Impl rule__Argument__Group_1__2 ;
    public final void rule__Argument__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3376:1: ( rule__Argument__Group_1__1__Impl rule__Argument__Group_1__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3377:2: rule__Argument__Group_1__1__Impl rule__Argument__Group_1__2
            {
            pushFollow(FOLLOW_rule__Argument__Group_1__1__Impl_in_rule__Argument__Group_1__16780);
            rule__Argument__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Argument__Group_1__2_in_rule__Argument__Group_1__16783);
            rule__Argument__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_1__1"


    // $ANTLR start "rule__Argument__Group_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3384:1: rule__Argument__Group_1__1__Impl : ( '+' ) ;
    public final void rule__Argument__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3388:1: ( ( '+' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3389:1: ( '+' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3389:1: ( '+' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3390:1: '+'
            {
             before(grammarAccess.getArgumentAccess().getPlusSignKeyword_1_1()); 
            match(input,28,FOLLOW_28_in_rule__Argument__Group_1__1__Impl6811); 
             after(grammarAccess.getArgumentAccess().getPlusSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_1__1__Impl"


    // $ANTLR start "rule__Argument__Group_1__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3403:1: rule__Argument__Group_1__2 : rule__Argument__Group_1__2__Impl ;
    public final void rule__Argument__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3407:1: ( rule__Argument__Group_1__2__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3408:2: rule__Argument__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group_1__2__Impl_in_rule__Argument__Group_1__26842);
            rule__Argument__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_1__2"


    // $ANTLR start "rule__Argument__Group_1__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3414:1: rule__Argument__Group_1__2__Impl : ( ( rule__Argument__RhsAssignment_1_2 ) ) ;
    public final void rule__Argument__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3418:1: ( ( ( rule__Argument__RhsAssignment_1_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3419:1: ( ( rule__Argument__RhsAssignment_1_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3419:1: ( ( rule__Argument__RhsAssignment_1_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3420:1: ( rule__Argument__RhsAssignment_1_2 )
            {
             before(grammarAccess.getArgumentAccess().getRhsAssignment_1_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3421:1: ( rule__Argument__RhsAssignment_1_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3421:2: rule__Argument__RhsAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Argument__RhsAssignment_1_2_in_rule__Argument__Group_1__2__Impl6869);
            rule__Argument__RhsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getArgumentAccess().getRhsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__Group_1__2__Impl"


    // $ANTLR start "rule__AddressBinding__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3437:1: rule__AddressBinding__Group__0 : rule__AddressBinding__Group__0__Impl rule__AddressBinding__Group__1 ;
    public final void rule__AddressBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3441:1: ( rule__AddressBinding__Group__0__Impl rule__AddressBinding__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3442:2: rule__AddressBinding__Group__0__Impl rule__AddressBinding__Group__1
            {
            pushFollow(FOLLOW_rule__AddressBinding__Group__0__Impl_in_rule__AddressBinding__Group__06905);
            rule__AddressBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressBinding__Group__1_in_rule__AddressBinding__Group__06908);
            rule__AddressBinding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__0"


    // $ANTLR start "rule__AddressBinding__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3449:1: rule__AddressBinding__Group__0__Impl : ( '@' ) ;
    public final void rule__AddressBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3453:1: ( ( '@' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3454:1: ( '@' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3454:1: ( '@' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3455:1: '@'
            {
             before(grammarAccess.getAddressBindingAccess().getCommercialAtKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__AddressBinding__Group__0__Impl6936); 
             after(grammarAccess.getAddressBindingAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__0__Impl"


    // $ANTLR start "rule__AddressBinding__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3468:1: rule__AddressBinding__Group__1 : rule__AddressBinding__Group__1__Impl rule__AddressBinding__Group__2 ;
    public final void rule__AddressBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3472:1: ( rule__AddressBinding__Group__1__Impl rule__AddressBinding__Group__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3473:2: rule__AddressBinding__Group__1__Impl rule__AddressBinding__Group__2
            {
            pushFollow(FOLLOW_rule__AddressBinding__Group__1__Impl_in_rule__AddressBinding__Group__16967);
            rule__AddressBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressBinding__Group__2_in_rule__AddressBinding__Group__16970);
            rule__AddressBinding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__1"


    // $ANTLR start "rule__AddressBinding__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3480:1: rule__AddressBinding__Group__1__Impl : ( ( rule__AddressBinding__Group_1__0 )? ) ;
    public final void rule__AddressBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3484:1: ( ( ( rule__AddressBinding__Group_1__0 )? ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3485:1: ( ( rule__AddressBinding__Group_1__0 )? )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3485:1: ( ( rule__AddressBinding__Group_1__0 )? )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3486:1: ( rule__AddressBinding__Group_1__0 )?
            {
             before(grammarAccess.getAddressBindingAccess().getGroup_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3487:1: ( rule__AddressBinding__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3487:2: rule__AddressBinding__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AddressBinding__Group_1__0_in_rule__AddressBinding__Group__1__Impl6997);
                    rule__AddressBinding__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAddressBindingAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__1__Impl"


    // $ANTLR start "rule__AddressBinding__Group__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3497:1: rule__AddressBinding__Group__2 : rule__AddressBinding__Group__2__Impl rule__AddressBinding__Group__3 ;
    public final void rule__AddressBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3501:1: ( rule__AddressBinding__Group__2__Impl rule__AddressBinding__Group__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3502:2: rule__AddressBinding__Group__2__Impl rule__AddressBinding__Group__3
            {
            pushFollow(FOLLOW_rule__AddressBinding__Group__2__Impl_in_rule__AddressBinding__Group__27028);
            rule__AddressBinding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressBinding__Group__3_in_rule__AddressBinding__Group__27031);
            rule__AddressBinding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__2"


    // $ANTLR start "rule__AddressBinding__Group__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3509:1: rule__AddressBinding__Group__2__Impl : ( '(' ) ;
    public final void rule__AddressBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3513:1: ( ( '(' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3514:1: ( '(' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3514:1: ( '(' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3515:1: '('
            {
             before(grammarAccess.getAddressBindingAccess().getLeftParenthesisKeyword_2()); 
            match(input,16,FOLLOW_16_in_rule__AddressBinding__Group__2__Impl7059); 
             after(grammarAccess.getAddressBindingAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__2__Impl"


    // $ANTLR start "rule__AddressBinding__Group__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3528:1: rule__AddressBinding__Group__3 : rule__AddressBinding__Group__3__Impl rule__AddressBinding__Group__4 ;
    public final void rule__AddressBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3532:1: ( rule__AddressBinding__Group__3__Impl rule__AddressBinding__Group__4 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3533:2: rule__AddressBinding__Group__3__Impl rule__AddressBinding__Group__4
            {
            pushFollow(FOLLOW_rule__AddressBinding__Group__3__Impl_in_rule__AddressBinding__Group__37090);
            rule__AddressBinding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressBinding__Group__4_in_rule__AddressBinding__Group__37093);
            rule__AddressBinding__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__3"


    // $ANTLR start "rule__AddressBinding__Group__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3540:1: rule__AddressBinding__Group__3__Impl : ( ( rule__AddressBinding__AddressesAssignment_3 ) ) ;
    public final void rule__AddressBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3544:1: ( ( ( rule__AddressBinding__AddressesAssignment_3 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3545:1: ( ( rule__AddressBinding__AddressesAssignment_3 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3545:1: ( ( rule__AddressBinding__AddressesAssignment_3 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3546:1: ( rule__AddressBinding__AddressesAssignment_3 )
            {
             before(grammarAccess.getAddressBindingAccess().getAddressesAssignment_3()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3547:1: ( rule__AddressBinding__AddressesAssignment_3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3547:2: rule__AddressBinding__AddressesAssignment_3
            {
            pushFollow(FOLLOW_rule__AddressBinding__AddressesAssignment_3_in_rule__AddressBinding__Group__3__Impl7120);
            rule__AddressBinding__AddressesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAddressBindingAccess().getAddressesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__3__Impl"


    // $ANTLR start "rule__AddressBinding__Group__4"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3557:1: rule__AddressBinding__Group__4 : rule__AddressBinding__Group__4__Impl rule__AddressBinding__Group__5 ;
    public final void rule__AddressBinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3561:1: ( rule__AddressBinding__Group__4__Impl rule__AddressBinding__Group__5 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3562:2: rule__AddressBinding__Group__4__Impl rule__AddressBinding__Group__5
            {
            pushFollow(FOLLOW_rule__AddressBinding__Group__4__Impl_in_rule__AddressBinding__Group__47150);
            rule__AddressBinding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressBinding__Group__5_in_rule__AddressBinding__Group__47153);
            rule__AddressBinding__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__4"


    // $ANTLR start "rule__AddressBinding__Group__4__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3569:1: rule__AddressBinding__Group__4__Impl : ( ( rule__AddressBinding__Group_4__0 )* ) ;
    public final void rule__AddressBinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3573:1: ( ( ( rule__AddressBinding__Group_4__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3574:1: ( ( rule__AddressBinding__Group_4__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3574:1: ( ( rule__AddressBinding__Group_4__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3575:1: ( rule__AddressBinding__Group_4__0 )*
            {
             before(grammarAccess.getAddressBindingAccess().getGroup_4()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3576:1: ( rule__AddressBinding__Group_4__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==20) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3576:2: rule__AddressBinding__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__AddressBinding__Group_4__0_in_rule__AddressBinding__Group__4__Impl7180);
            	    rule__AddressBinding__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getAddressBindingAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__4__Impl"


    // $ANTLR start "rule__AddressBinding__Group__5"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3586:1: rule__AddressBinding__Group__5 : rule__AddressBinding__Group__5__Impl ;
    public final void rule__AddressBinding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3590:1: ( rule__AddressBinding__Group__5__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3591:2: rule__AddressBinding__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__AddressBinding__Group__5__Impl_in_rule__AddressBinding__Group__57211);
            rule__AddressBinding__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__5"


    // $ANTLR start "rule__AddressBinding__Group__5__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3597:1: rule__AddressBinding__Group__5__Impl : ( ')' ) ;
    public final void rule__AddressBinding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3601:1: ( ( ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3602:1: ( ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3602:1: ( ')' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3603:1: ')'
            {
             before(grammarAccess.getAddressBindingAccess().getRightParenthesisKeyword_5()); 
            match(input,17,FOLLOW_17_in_rule__AddressBinding__Group__5__Impl7239); 
             after(grammarAccess.getAddressBindingAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group__5__Impl"


    // $ANTLR start "rule__AddressBinding__Group_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3628:1: rule__AddressBinding__Group_1__0 : rule__AddressBinding__Group_1__0__Impl rule__AddressBinding__Group_1__1 ;
    public final void rule__AddressBinding__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3632:1: ( rule__AddressBinding__Group_1__0__Impl rule__AddressBinding__Group_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3633:2: rule__AddressBinding__Group_1__0__Impl rule__AddressBinding__Group_1__1
            {
            pushFollow(FOLLOW_rule__AddressBinding__Group_1__0__Impl_in_rule__AddressBinding__Group_1__07282);
            rule__AddressBinding__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressBinding__Group_1__1_in_rule__AddressBinding__Group_1__07285);
            rule__AddressBinding__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group_1__0"


    // $ANTLR start "rule__AddressBinding__Group_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3640:1: rule__AddressBinding__Group_1__0__Impl : ( ( rule__AddressBinding__NameAssignment_1_0 ) ) ;
    public final void rule__AddressBinding__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3644:1: ( ( ( rule__AddressBinding__NameAssignment_1_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3645:1: ( ( rule__AddressBinding__NameAssignment_1_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3645:1: ( ( rule__AddressBinding__NameAssignment_1_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3646:1: ( rule__AddressBinding__NameAssignment_1_0 )
            {
             before(grammarAccess.getAddressBindingAccess().getNameAssignment_1_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3647:1: ( rule__AddressBinding__NameAssignment_1_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3647:2: rule__AddressBinding__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__AddressBinding__NameAssignment_1_0_in_rule__AddressBinding__Group_1__0__Impl7312);
            rule__AddressBinding__NameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAddressBindingAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group_1__0__Impl"


    // $ANTLR start "rule__AddressBinding__Group_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3657:1: rule__AddressBinding__Group_1__1 : rule__AddressBinding__Group_1__1__Impl ;
    public final void rule__AddressBinding__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3661:1: ( rule__AddressBinding__Group_1__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3662:2: rule__AddressBinding__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AddressBinding__Group_1__1__Impl_in_rule__AddressBinding__Group_1__17342);
            rule__AddressBinding__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group_1__1"


    // $ANTLR start "rule__AddressBinding__Group_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3668:1: rule__AddressBinding__Group_1__1__Impl : ( '=' ) ;
    public final void rule__AddressBinding__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3672:1: ( ( '=' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3673:1: ( '=' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3673:1: ( '=' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3674:1: '='
            {
             before(grammarAccess.getAddressBindingAccess().getEqualsSignKeyword_1_1()); 
            match(input,25,FOLLOW_25_in_rule__AddressBinding__Group_1__1__Impl7370); 
             after(grammarAccess.getAddressBindingAccess().getEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group_1__1__Impl"


    // $ANTLR start "rule__AddressBinding__Group_4__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3691:1: rule__AddressBinding__Group_4__0 : rule__AddressBinding__Group_4__0__Impl rule__AddressBinding__Group_4__1 ;
    public final void rule__AddressBinding__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3695:1: ( rule__AddressBinding__Group_4__0__Impl rule__AddressBinding__Group_4__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3696:2: rule__AddressBinding__Group_4__0__Impl rule__AddressBinding__Group_4__1
            {
            pushFollow(FOLLOW_rule__AddressBinding__Group_4__0__Impl_in_rule__AddressBinding__Group_4__07405);
            rule__AddressBinding__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AddressBinding__Group_4__1_in_rule__AddressBinding__Group_4__07408);
            rule__AddressBinding__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group_4__0"


    // $ANTLR start "rule__AddressBinding__Group_4__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3703:1: rule__AddressBinding__Group_4__0__Impl : ( ',' ) ;
    public final void rule__AddressBinding__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3707:1: ( ( ',' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3708:1: ( ',' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3708:1: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3709:1: ','
            {
             before(grammarAccess.getAddressBindingAccess().getCommaKeyword_4_0()); 
            match(input,20,FOLLOW_20_in_rule__AddressBinding__Group_4__0__Impl7436); 
             after(grammarAccess.getAddressBindingAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group_4__0__Impl"


    // $ANTLR start "rule__AddressBinding__Group_4__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3722:1: rule__AddressBinding__Group_4__1 : rule__AddressBinding__Group_4__1__Impl ;
    public final void rule__AddressBinding__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3726:1: ( rule__AddressBinding__Group_4__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3727:2: rule__AddressBinding__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__AddressBinding__Group_4__1__Impl_in_rule__AddressBinding__Group_4__17467);
            rule__AddressBinding__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group_4__1"


    // $ANTLR start "rule__AddressBinding__Group_4__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3733:1: rule__AddressBinding__Group_4__1__Impl : ( ( rule__AddressBinding__AddressesAssignment_4_1 ) ) ;
    public final void rule__AddressBinding__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3737:1: ( ( ( rule__AddressBinding__AddressesAssignment_4_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3738:1: ( ( rule__AddressBinding__AddressesAssignment_4_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3738:1: ( ( rule__AddressBinding__AddressesAssignment_4_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3739:1: ( rule__AddressBinding__AddressesAssignment_4_1 )
            {
             before(grammarAccess.getAddressBindingAccess().getAddressesAssignment_4_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3740:1: ( rule__AddressBinding__AddressesAssignment_4_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3740:2: rule__AddressBinding__AddressesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__AddressBinding__AddressesAssignment_4_1_in_rule__AddressBinding__Group_4__1__Impl7494);
            rule__AddressBinding__AddressesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAddressBindingAccess().getAddressesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__Group_4__1__Impl"


    // $ANTLR start "rule__Instantiation__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3754:1: rule__Instantiation__Group__0 : rule__Instantiation__Group__0__Impl rule__Instantiation__Group__1 ;
    public final void rule__Instantiation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3758:1: ( rule__Instantiation__Group__0__Impl rule__Instantiation__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3759:2: rule__Instantiation__Group__0__Impl rule__Instantiation__Group__1
            {
            pushFollow(FOLLOW_rule__Instantiation__Group__0__Impl_in_rule__Instantiation__Group__07528);
            rule__Instantiation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instantiation__Group__1_in_rule__Instantiation__Group__07531);
            rule__Instantiation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__0"


    // $ANTLR start "rule__Instantiation__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3766:1: rule__Instantiation__Group__0__Impl : ( '@' ) ;
    public final void rule__Instantiation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3770:1: ( ( '@' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3771:1: ( '@' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3771:1: ( '@' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3772:1: '@'
            {
             before(grammarAccess.getInstantiationAccess().getCommercialAtKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Instantiation__Group__0__Impl7559); 
             after(grammarAccess.getInstantiationAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__0__Impl"


    // $ANTLR start "rule__Instantiation__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3785:1: rule__Instantiation__Group__1 : rule__Instantiation__Group__1__Impl rule__Instantiation__Group__2 ;
    public final void rule__Instantiation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3789:1: ( rule__Instantiation__Group__1__Impl rule__Instantiation__Group__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3790:2: rule__Instantiation__Group__1__Impl rule__Instantiation__Group__2
            {
            pushFollow(FOLLOW_rule__Instantiation__Group__1__Impl_in_rule__Instantiation__Group__17590);
            rule__Instantiation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instantiation__Group__2_in_rule__Instantiation__Group__17593);
            rule__Instantiation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__1"


    // $ANTLR start "rule__Instantiation__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3797:1: rule__Instantiation__Group__1__Impl : ( ( rule__Instantiation__AddressAssignment_1 ) ) ;
    public final void rule__Instantiation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3801:1: ( ( ( rule__Instantiation__AddressAssignment_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3802:1: ( ( rule__Instantiation__AddressAssignment_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3802:1: ( ( rule__Instantiation__AddressAssignment_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3803:1: ( rule__Instantiation__AddressAssignment_1 )
            {
             before(grammarAccess.getInstantiationAccess().getAddressAssignment_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3804:1: ( rule__Instantiation__AddressAssignment_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3804:2: rule__Instantiation__AddressAssignment_1
            {
            pushFollow(FOLLOW_rule__Instantiation__AddressAssignment_1_in_rule__Instantiation__Group__1__Impl7620);
            rule__Instantiation__AddressAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInstantiationAccess().getAddressAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__1__Impl"


    // $ANTLR start "rule__Instantiation__Group__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3814:1: rule__Instantiation__Group__2 : rule__Instantiation__Group__2__Impl rule__Instantiation__Group__3 ;
    public final void rule__Instantiation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3818:1: ( rule__Instantiation__Group__2__Impl rule__Instantiation__Group__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3819:2: rule__Instantiation__Group__2__Impl rule__Instantiation__Group__3
            {
            pushFollow(FOLLOW_rule__Instantiation__Group__2__Impl_in_rule__Instantiation__Group__27650);
            rule__Instantiation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instantiation__Group__3_in_rule__Instantiation__Group__27653);
            rule__Instantiation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__2"


    // $ANTLR start "rule__Instantiation__Group__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3826:1: rule__Instantiation__Group__2__Impl : ( ':' ) ;
    public final void rule__Instantiation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3830:1: ( ( ':' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3831:1: ( ':' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3831:1: ( ':' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3832:1: ':'
            {
             before(grammarAccess.getInstantiationAccess().getColonKeyword_2()); 
            match(input,21,FOLLOW_21_in_rule__Instantiation__Group__2__Impl7681); 
             after(grammarAccess.getInstantiationAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__2__Impl"


    // $ANTLR start "rule__Instantiation__Group__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3845:1: rule__Instantiation__Group__3 : rule__Instantiation__Group__3__Impl rule__Instantiation__Group__4 ;
    public final void rule__Instantiation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3849:1: ( rule__Instantiation__Group__3__Impl rule__Instantiation__Group__4 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3850:2: rule__Instantiation__Group__3__Impl rule__Instantiation__Group__4
            {
            pushFollow(FOLLOW_rule__Instantiation__Group__3__Impl_in_rule__Instantiation__Group__37712);
            rule__Instantiation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instantiation__Group__4_in_rule__Instantiation__Group__37715);
            rule__Instantiation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__3"


    // $ANTLR start "rule__Instantiation__Group__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3857:1: rule__Instantiation__Group__3__Impl : ( ( rule__Instantiation__KindAssignment_3 ) ) ;
    public final void rule__Instantiation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3861:1: ( ( ( rule__Instantiation__KindAssignment_3 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3862:1: ( ( rule__Instantiation__KindAssignment_3 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3862:1: ( ( rule__Instantiation__KindAssignment_3 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3863:1: ( rule__Instantiation__KindAssignment_3 )
            {
             before(grammarAccess.getInstantiationAccess().getKindAssignment_3()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3864:1: ( rule__Instantiation__KindAssignment_3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3864:2: rule__Instantiation__KindAssignment_3
            {
            pushFollow(FOLLOW_rule__Instantiation__KindAssignment_3_in_rule__Instantiation__Group__3__Impl7742);
            rule__Instantiation__KindAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInstantiationAccess().getKindAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__3__Impl"


    // $ANTLR start "rule__Instantiation__Group__4"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3874:1: rule__Instantiation__Group__4 : rule__Instantiation__Group__4__Impl rule__Instantiation__Group__5 ;
    public final void rule__Instantiation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3878:1: ( rule__Instantiation__Group__4__Impl rule__Instantiation__Group__5 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3879:2: rule__Instantiation__Group__4__Impl rule__Instantiation__Group__5
            {
            pushFollow(FOLLOW_rule__Instantiation__Group__4__Impl_in_rule__Instantiation__Group__47772);
            rule__Instantiation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instantiation__Group__5_in_rule__Instantiation__Group__47775);
            rule__Instantiation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__4"


    // $ANTLR start "rule__Instantiation__Group__4__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3886:1: rule__Instantiation__Group__4__Impl : ( '(' ) ;
    public final void rule__Instantiation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3890:1: ( ( '(' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3891:1: ( '(' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3891:1: ( '(' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3892:1: '('
            {
             before(grammarAccess.getInstantiationAccess().getLeftParenthesisKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Instantiation__Group__4__Impl7803); 
             after(grammarAccess.getInstantiationAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__4__Impl"


    // $ANTLR start "rule__Instantiation__Group__5"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3905:1: rule__Instantiation__Group__5 : rule__Instantiation__Group__5__Impl rule__Instantiation__Group__6 ;
    public final void rule__Instantiation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3909:1: ( rule__Instantiation__Group__5__Impl rule__Instantiation__Group__6 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3910:2: rule__Instantiation__Group__5__Impl rule__Instantiation__Group__6
            {
            pushFollow(FOLLOW_rule__Instantiation__Group__5__Impl_in_rule__Instantiation__Group__57834);
            rule__Instantiation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instantiation__Group__6_in_rule__Instantiation__Group__57837);
            rule__Instantiation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__5"


    // $ANTLR start "rule__Instantiation__Group__5__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3917:1: rule__Instantiation__Group__5__Impl : ( ( rule__Instantiation__Group_5__0 )? ) ;
    public final void rule__Instantiation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3921:1: ( ( ( rule__Instantiation__Group_5__0 )? ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3922:1: ( ( rule__Instantiation__Group_5__0 )? )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3922:1: ( ( rule__Instantiation__Group_5__0 )? )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3923:1: ( rule__Instantiation__Group_5__0 )?
            {
             before(grammarAccess.getInstantiationAccess().getGroup_5()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3924:1: ( rule__Instantiation__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=29 && LA27_0<=31)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3924:2: rule__Instantiation__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Instantiation__Group_5__0_in_rule__Instantiation__Group__5__Impl7864);
                    rule__Instantiation__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstantiationAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__5__Impl"


    // $ANTLR start "rule__Instantiation__Group__6"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3934:1: rule__Instantiation__Group__6 : rule__Instantiation__Group__6__Impl ;
    public final void rule__Instantiation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3938:1: ( rule__Instantiation__Group__6__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3939:2: rule__Instantiation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Instantiation__Group__6__Impl_in_rule__Instantiation__Group__67895);
            rule__Instantiation__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__6"


    // $ANTLR start "rule__Instantiation__Group__6__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3945:1: rule__Instantiation__Group__6__Impl : ( ')' ) ;
    public final void rule__Instantiation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3949:1: ( ( ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3950:1: ( ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3950:1: ( ')' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3951:1: ')'
            {
             before(grammarAccess.getInstantiationAccess().getRightParenthesisKeyword_6()); 
            match(input,17,FOLLOW_17_in_rule__Instantiation__Group__6__Impl7923); 
             after(grammarAccess.getInstantiationAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__6__Impl"


    // $ANTLR start "rule__Instantiation__Group_5__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3978:1: rule__Instantiation__Group_5__0 : rule__Instantiation__Group_5__0__Impl rule__Instantiation__Group_5__1 ;
    public final void rule__Instantiation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3982:1: ( rule__Instantiation__Group_5__0__Impl rule__Instantiation__Group_5__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3983:2: rule__Instantiation__Group_5__0__Impl rule__Instantiation__Group_5__1
            {
            pushFollow(FOLLOW_rule__Instantiation__Group_5__0__Impl_in_rule__Instantiation__Group_5__07968);
            rule__Instantiation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instantiation__Group_5__1_in_rule__Instantiation__Group_5__07971);
            rule__Instantiation__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group_5__0"


    // $ANTLR start "rule__Instantiation__Group_5__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3990:1: rule__Instantiation__Group_5__0__Impl : ( ( rule__Instantiation__PropertiesAssignment_5_0 ) ) ;
    public final void rule__Instantiation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3994:1: ( ( ( rule__Instantiation__PropertiesAssignment_5_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3995:1: ( ( rule__Instantiation__PropertiesAssignment_5_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3995:1: ( ( rule__Instantiation__PropertiesAssignment_5_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3996:1: ( rule__Instantiation__PropertiesAssignment_5_0 )
            {
             before(grammarAccess.getInstantiationAccess().getPropertiesAssignment_5_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3997:1: ( rule__Instantiation__PropertiesAssignment_5_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:3997:2: rule__Instantiation__PropertiesAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Instantiation__PropertiesAssignment_5_0_in_rule__Instantiation__Group_5__0__Impl7998);
            rule__Instantiation__PropertiesAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getInstantiationAccess().getPropertiesAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group_5__0__Impl"


    // $ANTLR start "rule__Instantiation__Group_5__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4007:1: rule__Instantiation__Group_5__1 : rule__Instantiation__Group_5__1__Impl ;
    public final void rule__Instantiation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4011:1: ( rule__Instantiation__Group_5__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4012:2: rule__Instantiation__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Instantiation__Group_5__1__Impl_in_rule__Instantiation__Group_5__18028);
            rule__Instantiation__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group_5__1"


    // $ANTLR start "rule__Instantiation__Group_5__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4018:1: rule__Instantiation__Group_5__1__Impl : ( ( rule__Instantiation__Group_5_1__0 )* ) ;
    public final void rule__Instantiation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4022:1: ( ( ( rule__Instantiation__Group_5_1__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4023:1: ( ( rule__Instantiation__Group_5_1__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4023:1: ( ( rule__Instantiation__Group_5_1__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4024:1: ( rule__Instantiation__Group_5_1__0 )*
            {
             before(grammarAccess.getInstantiationAccess().getGroup_5_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4025:1: ( rule__Instantiation__Group_5_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==20) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4025:2: rule__Instantiation__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Instantiation__Group_5_1__0_in_rule__Instantiation__Group_5__1__Impl8055);
            	    rule__Instantiation__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getInstantiationAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group_5__1__Impl"


    // $ANTLR start "rule__Instantiation__Group_5_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4039:1: rule__Instantiation__Group_5_1__0 : rule__Instantiation__Group_5_1__0__Impl rule__Instantiation__Group_5_1__1 ;
    public final void rule__Instantiation__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4043:1: ( rule__Instantiation__Group_5_1__0__Impl rule__Instantiation__Group_5_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4044:2: rule__Instantiation__Group_5_1__0__Impl rule__Instantiation__Group_5_1__1
            {
            pushFollow(FOLLOW_rule__Instantiation__Group_5_1__0__Impl_in_rule__Instantiation__Group_5_1__08090);
            rule__Instantiation__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Instantiation__Group_5_1__1_in_rule__Instantiation__Group_5_1__08093);
            rule__Instantiation__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group_5_1__0"


    // $ANTLR start "rule__Instantiation__Group_5_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4051:1: rule__Instantiation__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__Instantiation__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4055:1: ( ( ',' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4056:1: ( ',' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4056:1: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4057:1: ','
            {
             before(grammarAccess.getInstantiationAccess().getCommaKeyword_5_1_0()); 
            match(input,20,FOLLOW_20_in_rule__Instantiation__Group_5_1__0__Impl8121); 
             after(grammarAccess.getInstantiationAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group_5_1__0__Impl"


    // $ANTLR start "rule__Instantiation__Group_5_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4070:1: rule__Instantiation__Group_5_1__1 : rule__Instantiation__Group_5_1__1__Impl ;
    public final void rule__Instantiation__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4074:1: ( rule__Instantiation__Group_5_1__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4075:2: rule__Instantiation__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Instantiation__Group_5_1__1__Impl_in_rule__Instantiation__Group_5_1__18152);
            rule__Instantiation__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group_5_1__1"


    // $ANTLR start "rule__Instantiation__Group_5_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4081:1: rule__Instantiation__Group_5_1__1__Impl : ( ( rule__Instantiation__PropertiesAssignment_5_1_1 ) ) ;
    public final void rule__Instantiation__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4085:1: ( ( ( rule__Instantiation__PropertiesAssignment_5_1_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4086:1: ( ( rule__Instantiation__PropertiesAssignment_5_1_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4086:1: ( ( rule__Instantiation__PropertiesAssignment_5_1_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4087:1: ( rule__Instantiation__PropertiesAssignment_5_1_1 )
            {
             before(grammarAccess.getInstantiationAccess().getPropertiesAssignment_5_1_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4088:1: ( rule__Instantiation__PropertiesAssignment_5_1_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4088:2: rule__Instantiation__PropertiesAssignment_5_1_1
            {
            pushFollow(FOLLOW_rule__Instantiation__PropertiesAssignment_5_1_1_in_rule__Instantiation__Group_5_1__1__Impl8179);
            rule__Instantiation__PropertiesAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getInstantiationAccess().getPropertiesAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group_5_1__1__Impl"


    // $ANTLR start "rule__DirectAddressSpec__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4102:1: rule__DirectAddressSpec__Group__0 : rule__DirectAddressSpec__Group__0__Impl rule__DirectAddressSpec__Group__1 ;
    public final void rule__DirectAddressSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4106:1: ( rule__DirectAddressSpec__Group__0__Impl rule__DirectAddressSpec__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4107:2: rule__DirectAddressSpec__Group__0__Impl rule__DirectAddressSpec__Group__1
            {
            pushFollow(FOLLOW_rule__DirectAddressSpec__Group__0__Impl_in_rule__DirectAddressSpec__Group__08213);
            rule__DirectAddressSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DirectAddressSpec__Group__1_in_rule__DirectAddressSpec__Group__08216);
            rule__DirectAddressSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectAddressSpec__Group__0"


    // $ANTLR start "rule__DirectAddressSpec__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4114:1: rule__DirectAddressSpec__Group__0__Impl : ( ( rule__DirectAddressSpec__NameAssignment_0 ) ) ;
    public final void rule__DirectAddressSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4118:1: ( ( ( rule__DirectAddressSpec__NameAssignment_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4119:1: ( ( rule__DirectAddressSpec__NameAssignment_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4119:1: ( ( rule__DirectAddressSpec__NameAssignment_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4120:1: ( rule__DirectAddressSpec__NameAssignment_0 )
            {
             before(grammarAccess.getDirectAddressSpecAccess().getNameAssignment_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4121:1: ( rule__DirectAddressSpec__NameAssignment_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4121:2: rule__DirectAddressSpec__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__DirectAddressSpec__NameAssignment_0_in_rule__DirectAddressSpec__Group__0__Impl8243);
            rule__DirectAddressSpec__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDirectAddressSpecAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectAddressSpec__Group__0__Impl"


    // $ANTLR start "rule__DirectAddressSpec__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4131:1: rule__DirectAddressSpec__Group__1 : rule__DirectAddressSpec__Group__1__Impl rule__DirectAddressSpec__Group__2 ;
    public final void rule__DirectAddressSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4135:1: ( rule__DirectAddressSpec__Group__1__Impl rule__DirectAddressSpec__Group__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4136:2: rule__DirectAddressSpec__Group__1__Impl rule__DirectAddressSpec__Group__2
            {
            pushFollow(FOLLOW_rule__DirectAddressSpec__Group__1__Impl_in_rule__DirectAddressSpec__Group__18273);
            rule__DirectAddressSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DirectAddressSpec__Group__2_in_rule__DirectAddressSpec__Group__18276);
            rule__DirectAddressSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectAddressSpec__Group__1"


    // $ANTLR start "rule__DirectAddressSpec__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4143:1: rule__DirectAddressSpec__Group__1__Impl : ( '=' ) ;
    public final void rule__DirectAddressSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4147:1: ( ( '=' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4148:1: ( '=' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4148:1: ( '=' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4149:1: '='
            {
             before(grammarAccess.getDirectAddressSpecAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__DirectAddressSpec__Group__1__Impl8304); 
             after(grammarAccess.getDirectAddressSpecAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectAddressSpec__Group__1__Impl"


    // $ANTLR start "rule__DirectAddressSpec__Group__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4162:1: rule__DirectAddressSpec__Group__2 : rule__DirectAddressSpec__Group__2__Impl ;
    public final void rule__DirectAddressSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4166:1: ( rule__DirectAddressSpec__Group__2__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4167:2: rule__DirectAddressSpec__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DirectAddressSpec__Group__2__Impl_in_rule__DirectAddressSpec__Group__28335);
            rule__DirectAddressSpec__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectAddressSpec__Group__2"


    // $ANTLR start "rule__DirectAddressSpec__Group__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4173:1: rule__DirectAddressSpec__Group__2__Impl : ( ( rule__DirectAddressSpec__AddressAssignment_2 ) ) ;
    public final void rule__DirectAddressSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4177:1: ( ( ( rule__DirectAddressSpec__AddressAssignment_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4178:1: ( ( rule__DirectAddressSpec__AddressAssignment_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4178:1: ( ( rule__DirectAddressSpec__AddressAssignment_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4179:1: ( rule__DirectAddressSpec__AddressAssignment_2 )
            {
             before(grammarAccess.getDirectAddressSpecAccess().getAddressAssignment_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4180:1: ( rule__DirectAddressSpec__AddressAssignment_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4180:2: rule__DirectAddressSpec__AddressAssignment_2
            {
            pushFollow(FOLLOW_rule__DirectAddressSpec__AddressAssignment_2_in_rule__DirectAddressSpec__Group__2__Impl8362);
            rule__DirectAddressSpec__AddressAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDirectAddressSpecAccess().getAddressAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectAddressSpec__Group__2__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_0__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4196:1: rule__InstantiationProperty__Group_0__0 : rule__InstantiationProperty__Group_0__0__Impl rule__InstantiationProperty__Group_0__1 ;
    public final void rule__InstantiationProperty__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4200:1: ( rule__InstantiationProperty__Group_0__0__Impl rule__InstantiationProperty__Group_0__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4201:2: rule__InstantiationProperty__Group_0__0__Impl rule__InstantiationProperty__Group_0__1
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_0__0__Impl_in_rule__InstantiationProperty__Group_0__08398);
            rule__InstantiationProperty__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstantiationProperty__Group_0__1_in_rule__InstantiationProperty__Group_0__08401);
            rule__InstantiationProperty__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_0__0"


    // $ANTLR start "rule__InstantiationProperty__Group_0__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4208:1: rule__InstantiationProperty__Group_0__0__Impl : ( () ) ;
    public final void rule__InstantiationProperty__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4212:1: ( ( () ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4213:1: ( () )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4213:1: ( () )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4214:1: ()
            {
             before(grammarAccess.getInstantiationPropertyAccess().getIDPropertyAction_0_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4215:1: ()
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4217:1: 
            {
            }

             after(grammarAccess.getInstantiationPropertyAccess().getIDPropertyAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_0__0__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_0__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4227:1: rule__InstantiationProperty__Group_0__1 : rule__InstantiationProperty__Group_0__1__Impl rule__InstantiationProperty__Group_0__2 ;
    public final void rule__InstantiationProperty__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4231:1: ( rule__InstantiationProperty__Group_0__1__Impl rule__InstantiationProperty__Group_0__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4232:2: rule__InstantiationProperty__Group_0__1__Impl rule__InstantiationProperty__Group_0__2
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_0__1__Impl_in_rule__InstantiationProperty__Group_0__18459);
            rule__InstantiationProperty__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstantiationProperty__Group_0__2_in_rule__InstantiationProperty__Group_0__18462);
            rule__InstantiationProperty__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_0__1"


    // $ANTLR start "rule__InstantiationProperty__Group_0__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4239:1: rule__InstantiationProperty__Group_0__1__Impl : ( 'ID' ) ;
    public final void rule__InstantiationProperty__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4243:1: ( ( 'ID' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4244:1: ( 'ID' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4244:1: ( 'ID' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4245:1: 'ID'
            {
             before(grammarAccess.getInstantiationPropertyAccess().getIDKeyword_0_1()); 
            match(input,29,FOLLOW_29_in_rule__InstantiationProperty__Group_0__1__Impl8490); 
             after(grammarAccess.getInstantiationPropertyAccess().getIDKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_0__1__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_0__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4258:1: rule__InstantiationProperty__Group_0__2 : rule__InstantiationProperty__Group_0__2__Impl rule__InstantiationProperty__Group_0__3 ;
    public final void rule__InstantiationProperty__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4262:1: ( rule__InstantiationProperty__Group_0__2__Impl rule__InstantiationProperty__Group_0__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4263:2: rule__InstantiationProperty__Group_0__2__Impl rule__InstantiationProperty__Group_0__3
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_0__2__Impl_in_rule__InstantiationProperty__Group_0__28521);
            rule__InstantiationProperty__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstantiationProperty__Group_0__3_in_rule__InstantiationProperty__Group_0__28524);
            rule__InstantiationProperty__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_0__2"


    // $ANTLR start "rule__InstantiationProperty__Group_0__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4270:1: rule__InstantiationProperty__Group_0__2__Impl : ( '=' ) ;
    public final void rule__InstantiationProperty__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4274:1: ( ( '=' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4275:1: ( '=' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4275:1: ( '=' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4276:1: '='
            {
             before(grammarAccess.getInstantiationPropertyAccess().getEqualsSignKeyword_0_2()); 
            match(input,25,FOLLOW_25_in_rule__InstantiationProperty__Group_0__2__Impl8552); 
             after(grammarAccess.getInstantiationPropertyAccess().getEqualsSignKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_0__2__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_0__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4289:1: rule__InstantiationProperty__Group_0__3 : rule__InstantiationProperty__Group_0__3__Impl ;
    public final void rule__InstantiationProperty__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4293:1: ( rule__InstantiationProperty__Group_0__3__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4294:2: rule__InstantiationProperty__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_0__3__Impl_in_rule__InstantiationProperty__Group_0__38583);
            rule__InstantiationProperty__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_0__3"


    // $ANTLR start "rule__InstantiationProperty__Group_0__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4300:1: rule__InstantiationProperty__Group_0__3__Impl : ( ( rule__InstantiationProperty__IdAssignment_0_3 ) ) ;
    public final void rule__InstantiationProperty__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4304:1: ( ( ( rule__InstantiationProperty__IdAssignment_0_3 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4305:1: ( ( rule__InstantiationProperty__IdAssignment_0_3 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4305:1: ( ( rule__InstantiationProperty__IdAssignment_0_3 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4306:1: ( rule__InstantiationProperty__IdAssignment_0_3 )
            {
             before(grammarAccess.getInstantiationPropertyAccess().getIdAssignment_0_3()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4307:1: ( rule__InstantiationProperty__IdAssignment_0_3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4307:2: rule__InstantiationProperty__IdAssignment_0_3
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__IdAssignment_0_3_in_rule__InstantiationProperty__Group_0__3__Impl8610);
            rule__InstantiationProperty__IdAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getInstantiationPropertyAccess().getIdAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_0__3__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4325:1: rule__InstantiationProperty__Group_1__0 : rule__InstantiationProperty__Group_1__0__Impl rule__InstantiationProperty__Group_1__1 ;
    public final void rule__InstantiationProperty__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4329:1: ( rule__InstantiationProperty__Group_1__0__Impl rule__InstantiationProperty__Group_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4330:2: rule__InstantiationProperty__Group_1__0__Impl rule__InstantiationProperty__Group_1__1
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_1__0__Impl_in_rule__InstantiationProperty__Group_1__08648);
            rule__InstantiationProperty__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstantiationProperty__Group_1__1_in_rule__InstantiationProperty__Group_1__08651);
            rule__InstantiationProperty__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_1__0"


    // $ANTLR start "rule__InstantiationProperty__Group_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4337:1: rule__InstantiationProperty__Group_1__0__Impl : ( () ) ;
    public final void rule__InstantiationProperty__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4341:1: ( ( () ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4342:1: ( () )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4342:1: ( () )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4343:1: ()
            {
             before(grammarAccess.getInstantiationPropertyAccess().getCRCPropertyAction_1_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4344:1: ()
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4346:1: 
            {
            }

             after(grammarAccess.getInstantiationPropertyAccess().getCRCPropertyAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_1__0__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4356:1: rule__InstantiationProperty__Group_1__1 : rule__InstantiationProperty__Group_1__1__Impl ;
    public final void rule__InstantiationProperty__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4360:1: ( rule__InstantiationProperty__Group_1__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4361:2: rule__InstantiationProperty__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_1__1__Impl_in_rule__InstantiationProperty__Group_1__18709);
            rule__InstantiationProperty__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_1__1"


    // $ANTLR start "rule__InstantiationProperty__Group_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4367:1: rule__InstantiationProperty__Group_1__1__Impl : ( 'CRC' ) ;
    public final void rule__InstantiationProperty__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4371:1: ( ( 'CRC' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4372:1: ( 'CRC' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4372:1: ( 'CRC' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4373:1: 'CRC'
            {
             before(grammarAccess.getInstantiationPropertyAccess().getCRCKeyword_1_1()); 
            match(input,30,FOLLOW_30_in_rule__InstantiationProperty__Group_1__1__Impl8737); 
             after(grammarAccess.getInstantiationPropertyAccess().getCRCKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_1__1__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_2__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4390:1: rule__InstantiationProperty__Group_2__0 : rule__InstantiationProperty__Group_2__0__Impl rule__InstantiationProperty__Group_2__1 ;
    public final void rule__InstantiationProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4394:1: ( rule__InstantiationProperty__Group_2__0__Impl rule__InstantiationProperty__Group_2__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4395:2: rule__InstantiationProperty__Group_2__0__Impl rule__InstantiationProperty__Group_2__1
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__0__Impl_in_rule__InstantiationProperty__Group_2__08772);
            rule__InstantiationProperty__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__1_in_rule__InstantiationProperty__Group_2__08775);
            rule__InstantiationProperty__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__0"


    // $ANTLR start "rule__InstantiationProperty__Group_2__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4402:1: rule__InstantiationProperty__Group_2__0__Impl : ( () ) ;
    public final void rule__InstantiationProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4406:1: ( ( () ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4407:1: ( () )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4407:1: ( () )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4408:1: ()
            {
             before(grammarAccess.getInstantiationPropertyAccess().getPublishPropertyAction_2_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4409:1: ()
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4411:1: 
            {
            }

             after(grammarAccess.getInstantiationPropertyAccess().getPublishPropertyAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__0__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_2__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4421:1: rule__InstantiationProperty__Group_2__1 : rule__InstantiationProperty__Group_2__1__Impl rule__InstantiationProperty__Group_2__2 ;
    public final void rule__InstantiationProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4425:1: ( rule__InstantiationProperty__Group_2__1__Impl rule__InstantiationProperty__Group_2__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4426:2: rule__InstantiationProperty__Group_2__1__Impl rule__InstantiationProperty__Group_2__2
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__1__Impl_in_rule__InstantiationProperty__Group_2__18833);
            rule__InstantiationProperty__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__2_in_rule__InstantiationProperty__Group_2__18836);
            rule__InstantiationProperty__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__1"


    // $ANTLR start "rule__InstantiationProperty__Group_2__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4433:1: rule__InstantiationProperty__Group_2__1__Impl : ( 'PUBLISH' ) ;
    public final void rule__InstantiationProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4437:1: ( ( 'PUBLISH' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4438:1: ( 'PUBLISH' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4438:1: ( 'PUBLISH' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4439:1: 'PUBLISH'
            {
             before(grammarAccess.getInstantiationPropertyAccess().getPUBLISHKeyword_2_1()); 
            match(input,31,FOLLOW_31_in_rule__InstantiationProperty__Group_2__1__Impl8864); 
             after(grammarAccess.getInstantiationPropertyAccess().getPUBLISHKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__1__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_2__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4452:1: rule__InstantiationProperty__Group_2__2 : rule__InstantiationProperty__Group_2__2__Impl rule__InstantiationProperty__Group_2__3 ;
    public final void rule__InstantiationProperty__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4456:1: ( rule__InstantiationProperty__Group_2__2__Impl rule__InstantiationProperty__Group_2__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4457:2: rule__InstantiationProperty__Group_2__2__Impl rule__InstantiationProperty__Group_2__3
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__2__Impl_in_rule__InstantiationProperty__Group_2__28895);
            rule__InstantiationProperty__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__3_in_rule__InstantiationProperty__Group_2__28898);
            rule__InstantiationProperty__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__2"


    // $ANTLR start "rule__InstantiationProperty__Group_2__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4464:1: rule__InstantiationProperty__Group_2__2__Impl : ( '(' ) ;
    public final void rule__InstantiationProperty__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4468:1: ( ( '(' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4469:1: ( '(' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4469:1: ( '(' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4470:1: '('
            {
             before(grammarAccess.getInstantiationPropertyAccess().getLeftParenthesisKeyword_2_2()); 
            match(input,16,FOLLOW_16_in_rule__InstantiationProperty__Group_2__2__Impl8926); 
             after(grammarAccess.getInstantiationPropertyAccess().getLeftParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__2__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_2__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4483:1: rule__InstantiationProperty__Group_2__3 : rule__InstantiationProperty__Group_2__3__Impl rule__InstantiationProperty__Group_2__4 ;
    public final void rule__InstantiationProperty__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4487:1: ( rule__InstantiationProperty__Group_2__3__Impl rule__InstantiationProperty__Group_2__4 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4488:2: rule__InstantiationProperty__Group_2__3__Impl rule__InstantiationProperty__Group_2__4
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__3__Impl_in_rule__InstantiationProperty__Group_2__38957);
            rule__InstantiationProperty__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__4_in_rule__InstantiationProperty__Group_2__38960);
            rule__InstantiationProperty__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__3"


    // $ANTLR start "rule__InstantiationProperty__Group_2__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4495:1: rule__InstantiationProperty__Group_2__3__Impl : ( ( rule__InstantiationProperty__ModeAssignment_2_3 ) ) ;
    public final void rule__InstantiationProperty__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4499:1: ( ( ( rule__InstantiationProperty__ModeAssignment_2_3 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4500:1: ( ( rule__InstantiationProperty__ModeAssignment_2_3 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4500:1: ( ( rule__InstantiationProperty__ModeAssignment_2_3 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4501:1: ( rule__InstantiationProperty__ModeAssignment_2_3 )
            {
             before(grammarAccess.getInstantiationPropertyAccess().getModeAssignment_2_3()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4502:1: ( rule__InstantiationProperty__ModeAssignment_2_3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4502:2: rule__InstantiationProperty__ModeAssignment_2_3
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__ModeAssignment_2_3_in_rule__InstantiationProperty__Group_2__3__Impl8987);
            rule__InstantiationProperty__ModeAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getInstantiationPropertyAccess().getModeAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__3__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_2__4"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4512:1: rule__InstantiationProperty__Group_2__4 : rule__InstantiationProperty__Group_2__4__Impl rule__InstantiationProperty__Group_2__5 ;
    public final void rule__InstantiationProperty__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4516:1: ( rule__InstantiationProperty__Group_2__4__Impl rule__InstantiationProperty__Group_2__5 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4517:2: rule__InstantiationProperty__Group_2__4__Impl rule__InstantiationProperty__Group_2__5
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__4__Impl_in_rule__InstantiationProperty__Group_2__49017);
            rule__InstantiationProperty__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__5_in_rule__InstantiationProperty__Group_2__49020);
            rule__InstantiationProperty__Group_2__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__4"


    // $ANTLR start "rule__InstantiationProperty__Group_2__4__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4524:1: rule__InstantiationProperty__Group_2__4__Impl : ( ',' ) ;
    public final void rule__InstantiationProperty__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4528:1: ( ( ',' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4529:1: ( ',' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4529:1: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4530:1: ','
            {
             before(grammarAccess.getInstantiationPropertyAccess().getCommaKeyword_2_4()); 
            match(input,20,FOLLOW_20_in_rule__InstantiationProperty__Group_2__4__Impl9048); 
             after(grammarAccess.getInstantiationPropertyAccess().getCommaKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__4__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_2__5"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4543:1: rule__InstantiationProperty__Group_2__5 : rule__InstantiationProperty__Group_2__5__Impl rule__InstantiationProperty__Group_2__6 ;
    public final void rule__InstantiationProperty__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4547:1: ( rule__InstantiationProperty__Group_2__5__Impl rule__InstantiationProperty__Group_2__6 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4548:2: rule__InstantiationProperty__Group_2__5__Impl rule__InstantiationProperty__Group_2__6
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__5__Impl_in_rule__InstantiationProperty__Group_2__59079);
            rule__InstantiationProperty__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__6_in_rule__InstantiationProperty__Group_2__59082);
            rule__InstantiationProperty__Group_2__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__5"


    // $ANTLR start "rule__InstantiationProperty__Group_2__5__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4555:1: rule__InstantiationProperty__Group_2__5__Impl : ( ( rule__InstantiationProperty__RateAssignment_2_5 ) ) ;
    public final void rule__InstantiationProperty__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4559:1: ( ( ( rule__InstantiationProperty__RateAssignment_2_5 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4560:1: ( ( rule__InstantiationProperty__RateAssignment_2_5 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4560:1: ( ( rule__InstantiationProperty__RateAssignment_2_5 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4561:1: ( rule__InstantiationProperty__RateAssignment_2_5 )
            {
             before(grammarAccess.getInstantiationPropertyAccess().getRateAssignment_2_5()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4562:1: ( rule__InstantiationProperty__RateAssignment_2_5 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4562:2: rule__InstantiationProperty__RateAssignment_2_5
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__RateAssignment_2_5_in_rule__InstantiationProperty__Group_2__5__Impl9109);
            rule__InstantiationProperty__RateAssignment_2_5();

            state._fsp--;


            }

             after(grammarAccess.getInstantiationPropertyAccess().getRateAssignment_2_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__5__Impl"


    // $ANTLR start "rule__InstantiationProperty__Group_2__6"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4572:1: rule__InstantiationProperty__Group_2__6 : rule__InstantiationProperty__Group_2__6__Impl ;
    public final void rule__InstantiationProperty__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4576:1: ( rule__InstantiationProperty__Group_2__6__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4577:2: rule__InstantiationProperty__Group_2__6__Impl
            {
            pushFollow(FOLLOW_rule__InstantiationProperty__Group_2__6__Impl_in_rule__InstantiationProperty__Group_2__69139);
            rule__InstantiationProperty__Group_2__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__6"


    // $ANTLR start "rule__InstantiationProperty__Group_2__6__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4583:1: rule__InstantiationProperty__Group_2__6__Impl : ( ')' ) ;
    public final void rule__InstantiationProperty__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4587:1: ( ( ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4588:1: ( ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4588:1: ( ')' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4589:1: ')'
            {
             before(grammarAccess.getInstantiationPropertyAccess().getRightParenthesisKeyword_2_6()); 
            match(input,17,FOLLOW_17_in_rule__InstantiationProperty__Group_2__6__Impl9167); 
             after(grammarAccess.getInstantiationPropertyAccess().getRightParenthesisKeyword_2_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__Group_2__6__Impl"


    // $ANTLR start "rule__Grouping__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4616:1: rule__Grouping__Group__0 : rule__Grouping__Group__0__Impl rule__Grouping__Group__1 ;
    public final void rule__Grouping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4620:1: ( rule__Grouping__Group__0__Impl rule__Grouping__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4621:2: rule__Grouping__Group__0__Impl rule__Grouping__Group__1
            {
            pushFollow(FOLLOW_rule__Grouping__Group__0__Impl_in_rule__Grouping__Group__09212);
            rule__Grouping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouping__Group__1_in_rule__Grouping__Group__09215);
            rule__Grouping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group__0"


    // $ANTLR start "rule__Grouping__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4628:1: rule__Grouping__Group__0__Impl : ( ( rule__Grouping__NameAssignment_0 ) ) ;
    public final void rule__Grouping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4632:1: ( ( ( rule__Grouping__NameAssignment_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4633:1: ( ( rule__Grouping__NameAssignment_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4633:1: ( ( rule__Grouping__NameAssignment_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4634:1: ( rule__Grouping__NameAssignment_0 )
            {
             before(grammarAccess.getGroupingAccess().getNameAssignment_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4635:1: ( rule__Grouping__NameAssignment_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4635:2: rule__Grouping__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Grouping__NameAssignment_0_in_rule__Grouping__Group__0__Impl9242);
            rule__Grouping__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGroupingAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group__0__Impl"


    // $ANTLR start "rule__Grouping__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4645:1: rule__Grouping__Group__1 : rule__Grouping__Group__1__Impl rule__Grouping__Group__2 ;
    public final void rule__Grouping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4649:1: ( rule__Grouping__Group__1__Impl rule__Grouping__Group__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4650:2: rule__Grouping__Group__1__Impl rule__Grouping__Group__2
            {
            pushFollow(FOLLOW_rule__Grouping__Group__1__Impl_in_rule__Grouping__Group__19272);
            rule__Grouping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouping__Group__2_in_rule__Grouping__Group__19275);
            rule__Grouping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group__1"


    // $ANTLR start "rule__Grouping__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4657:1: rule__Grouping__Group__1__Impl : ( '=' ) ;
    public final void rule__Grouping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4661:1: ( ( '=' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4662:1: ( '=' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4662:1: ( '=' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4663:1: '='
            {
             before(grammarAccess.getGroupingAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__Grouping__Group__1__Impl9303); 
             after(grammarAccess.getGroupingAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group__1__Impl"


    // $ANTLR start "rule__Grouping__Group__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4676:1: rule__Grouping__Group__2 : rule__Grouping__Group__2__Impl rule__Grouping__Group__3 ;
    public final void rule__Grouping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4680:1: ( rule__Grouping__Group__2__Impl rule__Grouping__Group__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4681:2: rule__Grouping__Group__2__Impl rule__Grouping__Group__3
            {
            pushFollow(FOLLOW_rule__Grouping__Group__2__Impl_in_rule__Grouping__Group__29334);
            rule__Grouping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouping__Group__3_in_rule__Grouping__Group__29337);
            rule__Grouping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group__2"


    // $ANTLR start "rule__Grouping__Group__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4688:1: rule__Grouping__Group__2__Impl : ( ( rule__Grouping__ElementsAssignment_2 ) ) ;
    public final void rule__Grouping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4692:1: ( ( ( rule__Grouping__ElementsAssignment_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4693:1: ( ( rule__Grouping__ElementsAssignment_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4693:1: ( ( rule__Grouping__ElementsAssignment_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4694:1: ( rule__Grouping__ElementsAssignment_2 )
            {
             before(grammarAccess.getGroupingAccess().getElementsAssignment_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4695:1: ( rule__Grouping__ElementsAssignment_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4695:2: rule__Grouping__ElementsAssignment_2
            {
            pushFollow(FOLLOW_rule__Grouping__ElementsAssignment_2_in_rule__Grouping__Group__2__Impl9364);
            rule__Grouping__ElementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGroupingAccess().getElementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group__2__Impl"


    // $ANTLR start "rule__Grouping__Group__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4705:1: rule__Grouping__Group__3 : rule__Grouping__Group__3__Impl ;
    public final void rule__Grouping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4709:1: ( rule__Grouping__Group__3__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4710:2: rule__Grouping__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Grouping__Group__3__Impl_in_rule__Grouping__Group__39394);
            rule__Grouping__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group__3"


    // $ANTLR start "rule__Grouping__Group__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4716:1: rule__Grouping__Group__3__Impl : ( ( rule__Grouping__Group_3__0 )* ) ;
    public final void rule__Grouping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4720:1: ( ( ( rule__Grouping__Group_3__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4721:1: ( ( rule__Grouping__Group_3__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4721:1: ( ( rule__Grouping__Group_3__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4722:1: ( rule__Grouping__Group_3__0 )*
            {
             before(grammarAccess.getGroupingAccess().getGroup_3()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4723:1: ( rule__Grouping__Group_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==20) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4723:2: rule__Grouping__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Grouping__Group_3__0_in_rule__Grouping__Group__3__Impl9421);
            	    rule__Grouping__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getGroupingAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group__3__Impl"


    // $ANTLR start "rule__Grouping__Group_3__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4741:1: rule__Grouping__Group_3__0 : rule__Grouping__Group_3__0__Impl rule__Grouping__Group_3__1 ;
    public final void rule__Grouping__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4745:1: ( rule__Grouping__Group_3__0__Impl rule__Grouping__Group_3__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4746:2: rule__Grouping__Group_3__0__Impl rule__Grouping__Group_3__1
            {
            pushFollow(FOLLOW_rule__Grouping__Group_3__0__Impl_in_rule__Grouping__Group_3__09460);
            rule__Grouping__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouping__Group_3__1_in_rule__Grouping__Group_3__09463);
            rule__Grouping__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group_3__0"


    // $ANTLR start "rule__Grouping__Group_3__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4753:1: rule__Grouping__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Grouping__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4757:1: ( ( ',' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4758:1: ( ',' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4758:1: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4759:1: ','
            {
             before(grammarAccess.getGroupingAccess().getCommaKeyword_3_0()); 
            match(input,20,FOLLOW_20_in_rule__Grouping__Group_3__0__Impl9491); 
             after(grammarAccess.getGroupingAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group_3__0__Impl"


    // $ANTLR start "rule__Grouping__Group_3__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4772:1: rule__Grouping__Group_3__1 : rule__Grouping__Group_3__1__Impl ;
    public final void rule__Grouping__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4776:1: ( rule__Grouping__Group_3__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4777:2: rule__Grouping__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Grouping__Group_3__1__Impl_in_rule__Grouping__Group_3__19522);
            rule__Grouping__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group_3__1"


    // $ANTLR start "rule__Grouping__Group_3__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4783:1: rule__Grouping__Group_3__1__Impl : ( ( rule__Grouping__ElementsAssignment_3_1 ) ) ;
    public final void rule__Grouping__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4787:1: ( ( ( rule__Grouping__ElementsAssignment_3_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4788:1: ( ( rule__Grouping__ElementsAssignment_3_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4788:1: ( ( rule__Grouping__ElementsAssignment_3_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4789:1: ( rule__Grouping__ElementsAssignment_3_1 )
            {
             before(grammarAccess.getGroupingAccess().getElementsAssignment_3_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4790:1: ( rule__Grouping__ElementsAssignment_3_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4790:2: rule__Grouping__ElementsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Grouping__ElementsAssignment_3_1_in_rule__Grouping__Group_3__1__Impl9549);
            rule__Grouping__ElementsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupingAccess().getElementsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group_3__1__Impl"


    // $ANTLR start "rule__GroupElement__Group__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4804:1: rule__GroupElement__Group__0 : rule__GroupElement__Group__0__Impl rule__GroupElement__Group__1 ;
    public final void rule__GroupElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4808:1: ( rule__GroupElement__Group__0__Impl rule__GroupElement__Group__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4809:2: rule__GroupElement__Group__0__Impl rule__GroupElement__Group__1
            {
            pushFollow(FOLLOW_rule__GroupElement__Group__0__Impl_in_rule__GroupElement__Group__09583);
            rule__GroupElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GroupElement__Group__1_in_rule__GroupElement__Group__09586);
            rule__GroupElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupElement__Group__0"


    // $ANTLR start "rule__GroupElement__Group__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4816:1: rule__GroupElement__Group__0__Impl : ( ( rule__GroupElement__PathAssignment_0 ) ) ;
    public final void rule__GroupElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4820:1: ( ( ( rule__GroupElement__PathAssignment_0 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4821:1: ( ( rule__GroupElement__PathAssignment_0 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4821:1: ( ( rule__GroupElement__PathAssignment_0 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4822:1: ( rule__GroupElement__PathAssignment_0 )
            {
             before(grammarAccess.getGroupElementAccess().getPathAssignment_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4823:1: ( rule__GroupElement__PathAssignment_0 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4823:2: rule__GroupElement__PathAssignment_0
            {
            pushFollow(FOLLOW_rule__GroupElement__PathAssignment_0_in_rule__GroupElement__Group__0__Impl9613);
            rule__GroupElement__PathAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGroupElementAccess().getPathAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupElement__Group__0__Impl"


    // $ANTLR start "rule__GroupElement__Group__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4833:1: rule__GroupElement__Group__1 : rule__GroupElement__Group__1__Impl ;
    public final void rule__GroupElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4837:1: ( rule__GroupElement__Group__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4838:2: rule__GroupElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GroupElement__Group__1__Impl_in_rule__GroupElement__Group__19643);
            rule__GroupElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupElement__Group__1"


    // $ANTLR start "rule__GroupElement__Group__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4844:1: rule__GroupElement__Group__1__Impl : ( ( rule__GroupElement__Group_1__0 )* ) ;
    public final void rule__GroupElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4848:1: ( ( ( rule__GroupElement__Group_1__0 )* ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4849:1: ( ( rule__GroupElement__Group_1__0 )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4849:1: ( ( rule__GroupElement__Group_1__0 )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4850:1: ( rule__GroupElement__Group_1__0 )*
            {
             before(grammarAccess.getGroupElementAccess().getGroup_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4851:1: ( rule__GroupElement__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==32) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4851:2: rule__GroupElement__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__GroupElement__Group_1__0_in_rule__GroupElement__Group__1__Impl9670);
            	    rule__GroupElement__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getGroupElementAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupElement__Group__1__Impl"


    // $ANTLR start "rule__GroupElement__Group_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4865:1: rule__GroupElement__Group_1__0 : rule__GroupElement__Group_1__0__Impl rule__GroupElement__Group_1__1 ;
    public final void rule__GroupElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4869:1: ( rule__GroupElement__Group_1__0__Impl rule__GroupElement__Group_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4870:2: rule__GroupElement__Group_1__0__Impl rule__GroupElement__Group_1__1
            {
            pushFollow(FOLLOW_rule__GroupElement__Group_1__0__Impl_in_rule__GroupElement__Group_1__09705);
            rule__GroupElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GroupElement__Group_1__1_in_rule__GroupElement__Group_1__09708);
            rule__GroupElement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupElement__Group_1__0"


    // $ANTLR start "rule__GroupElement__Group_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4877:1: rule__GroupElement__Group_1__0__Impl : ( '.' ) ;
    public final void rule__GroupElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4881:1: ( ( '.' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4882:1: ( '.' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4882:1: ( '.' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4883:1: '.'
            {
             before(grammarAccess.getGroupElementAccess().getFullStopKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__GroupElement__Group_1__0__Impl9736); 
             after(grammarAccess.getGroupElementAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupElement__Group_1__0__Impl"


    // $ANTLR start "rule__GroupElement__Group_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4896:1: rule__GroupElement__Group_1__1 : rule__GroupElement__Group_1__1__Impl ;
    public final void rule__GroupElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4900:1: ( rule__GroupElement__Group_1__1__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4901:2: rule__GroupElement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__GroupElement__Group_1__1__Impl_in_rule__GroupElement__Group_1__19767);
            rule__GroupElement__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupElement__Group_1__1"


    // $ANTLR start "rule__GroupElement__Group_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4907:1: rule__GroupElement__Group_1__1__Impl : ( ( rule__GroupElement__PathAssignment_1_1 ) ) ;
    public final void rule__GroupElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4911:1: ( ( ( rule__GroupElement__PathAssignment_1_1 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4912:1: ( ( rule__GroupElement__PathAssignment_1_1 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4912:1: ( ( rule__GroupElement__PathAssignment_1_1 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4913:1: ( rule__GroupElement__PathAssignment_1_1 )
            {
             before(grammarAccess.getGroupElementAccess().getPathAssignment_1_1()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4914:1: ( rule__GroupElement__PathAssignment_1_1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4914:2: rule__GroupElement__PathAssignment_1_1
            {
            pushFollow(FOLLOW_rule__GroupElement__PathAssignment_1_1_in_rule__GroupElement__Group_1__1__Impl9794);
            rule__GroupElement__PathAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupElementAccess().getPathAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupElement__Group_1__1__Impl"


    // $ANTLR start "rule__PathElement__Group_1__0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4928:1: rule__PathElement__Group_1__0 : rule__PathElement__Group_1__0__Impl rule__PathElement__Group_1__1 ;
    public final void rule__PathElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4932:1: ( rule__PathElement__Group_1__0__Impl rule__PathElement__Group_1__1 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4933:2: rule__PathElement__Group_1__0__Impl rule__PathElement__Group_1__1
            {
            pushFollow(FOLLOW_rule__PathElement__Group_1__0__Impl_in_rule__PathElement__Group_1__09828);
            rule__PathElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathElement__Group_1__1_in_rule__PathElement__Group_1__09831);
            rule__PathElement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__Group_1__0"


    // $ANTLR start "rule__PathElement__Group_1__0__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4940:1: rule__PathElement__Group_1__0__Impl : ( 'ALL' ) ;
    public final void rule__PathElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4944:1: ( ( 'ALL' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4945:1: ( 'ALL' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4945:1: ( 'ALL' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4946:1: 'ALL'
            {
             before(grammarAccess.getPathElementAccess().getALLKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__PathElement__Group_1__0__Impl9859); 
             after(grammarAccess.getPathElementAccess().getALLKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__Group_1__0__Impl"


    // $ANTLR start "rule__PathElement__Group_1__1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4959:1: rule__PathElement__Group_1__1 : rule__PathElement__Group_1__1__Impl rule__PathElement__Group_1__2 ;
    public final void rule__PathElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4963:1: ( rule__PathElement__Group_1__1__Impl rule__PathElement__Group_1__2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4964:2: rule__PathElement__Group_1__1__Impl rule__PathElement__Group_1__2
            {
            pushFollow(FOLLOW_rule__PathElement__Group_1__1__Impl_in_rule__PathElement__Group_1__19890);
            rule__PathElement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathElement__Group_1__2_in_rule__PathElement__Group_1__19893);
            rule__PathElement__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__Group_1__1"


    // $ANTLR start "rule__PathElement__Group_1__1__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4971:1: rule__PathElement__Group_1__1__Impl : ( '(' ) ;
    public final void rule__PathElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4975:1: ( ( '(' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4976:1: ( '(' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4976:1: ( '(' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4977:1: '('
            {
             before(grammarAccess.getPathElementAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,16,FOLLOW_16_in_rule__PathElement__Group_1__1__Impl9921); 
             after(grammarAccess.getPathElementAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__Group_1__1__Impl"


    // $ANTLR start "rule__PathElement__Group_1__2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4990:1: rule__PathElement__Group_1__2 : rule__PathElement__Group_1__2__Impl rule__PathElement__Group_1__3 ;
    public final void rule__PathElement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4994:1: ( rule__PathElement__Group_1__2__Impl rule__PathElement__Group_1__3 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:4995:2: rule__PathElement__Group_1__2__Impl rule__PathElement__Group_1__3
            {
            pushFollow(FOLLOW_rule__PathElement__Group_1__2__Impl_in_rule__PathElement__Group_1__29952);
            rule__PathElement__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathElement__Group_1__3_in_rule__PathElement__Group_1__29955);
            rule__PathElement__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__Group_1__2"


    // $ANTLR start "rule__PathElement__Group_1__2__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5002:1: rule__PathElement__Group_1__2__Impl : ( ( rule__PathElement__TypeAssignment_1_2 ) ) ;
    public final void rule__PathElement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5006:1: ( ( ( rule__PathElement__TypeAssignment_1_2 ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5007:1: ( ( rule__PathElement__TypeAssignment_1_2 ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5007:1: ( ( rule__PathElement__TypeAssignment_1_2 ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5008:1: ( rule__PathElement__TypeAssignment_1_2 )
            {
             before(grammarAccess.getPathElementAccess().getTypeAssignment_1_2()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5009:1: ( rule__PathElement__TypeAssignment_1_2 )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5009:2: rule__PathElement__TypeAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PathElement__TypeAssignment_1_2_in_rule__PathElement__Group_1__2__Impl9982);
            rule__PathElement__TypeAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPathElementAccess().getTypeAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__Group_1__2__Impl"


    // $ANTLR start "rule__PathElement__Group_1__3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5019:1: rule__PathElement__Group_1__3 : rule__PathElement__Group_1__3__Impl ;
    public final void rule__PathElement__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5023:1: ( rule__PathElement__Group_1__3__Impl )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5024:2: rule__PathElement__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__PathElement__Group_1__3__Impl_in_rule__PathElement__Group_1__310012);
            rule__PathElement__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__Group_1__3"


    // $ANTLR start "rule__PathElement__Group_1__3__Impl"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5030:1: rule__PathElement__Group_1__3__Impl : ( ')' ) ;
    public final void rule__PathElement__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5034:1: ( ( ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5035:1: ( ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5035:1: ( ')' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5036:1: ')'
            {
             before(grammarAccess.getPathElementAccess().getRightParenthesisKeyword_1_3()); 
            match(input,17,FOLLOW_17_in_rule__PathElement__Group_1__3__Impl10040); 
             after(grammarAccess.getPathElementAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__Group_1__3__Impl"


    // $ANTLR start "rule__LinkSpec__NameAssignment_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5058:1: rule__LinkSpec__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LinkSpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5062:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5063:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5063:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5064:1: RULE_ID
            {
             before(grammarAccess.getLinkSpecAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LinkSpec__NameAssignment_110084); 
             after(grammarAccess.getLinkSpecAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__NameAssignment_1"


    // $ANTLR start "rule__LinkSpec__ConstructorsAssignment_3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5073:1: rule__LinkSpec__ConstructorsAssignment_3 : ( ruleConstructor ) ;
    public final void rule__LinkSpec__ConstructorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5077:1: ( ( ruleConstructor ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5078:1: ( ruleConstructor )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5078:1: ( ruleConstructor )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5079:1: ruleConstructor
            {
             before(grammarAccess.getLinkSpecAccess().getConstructorsConstructorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConstructor_in_rule__LinkSpec__ConstructorsAssignment_310115);
            ruleConstructor();

            state._fsp--;

             after(grammarAccess.getLinkSpecAccess().getConstructorsConstructorParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkSpec__ConstructorsAssignment_3"


    // $ANTLR start "rule__Constructor__IsPublicAssignment_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5088:1: rule__Constructor__IsPublicAssignment_0 : ( ( 'public' ) ) ;
    public final void rule__Constructor__IsPublicAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5092:1: ( ( ( 'public' ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5093:1: ( ( 'public' ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5093:1: ( ( 'public' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5094:1: ( 'public' )
            {
             before(grammarAccess.getConstructorAccess().getIsPublicPublicKeyword_0_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5095:1: ( 'public' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5096:1: 'public'
            {
             before(grammarAccess.getConstructorAccess().getIsPublicPublicKeyword_0_0()); 
            match(input,34,FOLLOW_34_in_rule__Constructor__IsPublicAssignment_010151); 
             after(grammarAccess.getConstructorAccess().getIsPublicPublicKeyword_0_0()); 

            }

             after(grammarAccess.getConstructorAccess().getIsPublicPublicKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__IsPublicAssignment_0"


    // $ANTLR start "rule__Constructor__NameAssignment_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5111:1: rule__Constructor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Constructor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5115:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5116:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5116:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5117:1: RULE_ID
            {
             before(grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constructor__NameAssignment_110190); 
             after(grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__NameAssignment_1"


    // $ANTLR start "rule__Constructor__ParametersAssignment_3_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5126:1: rule__Constructor__ParametersAssignment_3_0 : ( RULE_ID ) ;
    public final void rule__Constructor__ParametersAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5130:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5131:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5131:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5132:1: RULE_ID
            {
             before(grammarAccess.getConstructorAccess().getParametersIDTerminalRuleCall_3_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constructor__ParametersAssignment_3_010221); 
             after(grammarAccess.getConstructorAccess().getParametersIDTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__ParametersAssignment_3_0"


    // $ANTLR start "rule__Constructor__ParametersAssignment_3_1_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5141:1: rule__Constructor__ParametersAssignment_3_1_1 : ( RULE_ID ) ;
    public final void rule__Constructor__ParametersAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5145:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5146:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5146:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5147:1: RULE_ID
            {
             before(grammarAccess.getConstructorAccess().getParametersIDTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Constructor__ParametersAssignment_3_1_110252); 
             after(grammarAccess.getConstructorAccess().getParametersIDTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__ParametersAssignment_3_1_1"


    // $ANTLR start "rule__Constructor__AddressesAssignment_5_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5156:1: rule__Constructor__AddressesAssignment_5_1 : ( ruleConstructorAddressParameters ) ;
    public final void rule__Constructor__AddressesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5160:1: ( ( ruleConstructorAddressParameters ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5161:1: ( ruleConstructorAddressParameters )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5161:1: ( ruleConstructorAddressParameters )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5162:1: ruleConstructorAddressParameters
            {
             before(grammarAccess.getConstructorAccess().getAddressesConstructorAddressParametersParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleConstructorAddressParameters_in_rule__Constructor__AddressesAssignment_5_110283);
            ruleConstructorAddressParameters();

            state._fsp--;

             after(grammarAccess.getConstructorAccess().getAddressesConstructorAddressParametersParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__AddressesAssignment_5_1"


    // $ANTLR start "rule__Constructor__MembersAssignment_7_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5171:1: rule__Constructor__MembersAssignment_7_0 : ( ruleMember ) ;
    public final void rule__Constructor__MembersAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5175:1: ( ( ruleMember ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5176:1: ( ruleMember )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5176:1: ( ruleMember )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5177:1: ruleMember
            {
             before(grammarAccess.getConstructorAccess().getMembersMemberParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_ruleMember_in_rule__Constructor__MembersAssignment_7_010314);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getConstructorAccess().getMembersMemberParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constructor__MembersAssignment_7_0"


    // $ANTLR start "rule__NamedAddresses__AddressNamesAssignment_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5186:1: rule__NamedAddresses__AddressNamesAssignment_1 : ( RULE_ID ) ;
    public final void rule__NamedAddresses__AddressNamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5190:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5191:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5191:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5192:1: RULE_ID
            {
             before(grammarAccess.getNamedAddressesAccess().getAddressNamesIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamedAddresses__AddressNamesAssignment_110345); 
             after(grammarAccess.getNamedAddressesAccess().getAddressNamesIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__AddressNamesAssignment_1"


    // $ANTLR start "rule__NamedAddresses__AddressNamesAssignment_2_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5201:1: rule__NamedAddresses__AddressNamesAssignment_2_2 : ( RULE_ID ) ;
    public final void rule__NamedAddresses__AddressNamesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5205:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5206:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5206:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5207:1: RULE_ID
            {
             before(grammarAccess.getNamedAddressesAccess().getAddressNamesIDTerminalRuleCall_2_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamedAddresses__AddressNamesAssignment_2_210376); 
             after(grammarAccess.getNamedAddressesAccess().getAddressNamesIDTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddresses__AddressNamesAssignment_2_2"


    // $ANTLR start "rule__AddressTuple__ElementsAssignment_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5216:1: rule__AddressTuple__ElementsAssignment_2 : ( RULE_ID ) ;
    public final void rule__AddressTuple__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5220:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5221:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5221:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5222:1: RULE_ID
            {
             before(grammarAccess.getAddressTupleAccess().getElementsIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddressTuple__ElementsAssignment_210407); 
             after(grammarAccess.getAddressTupleAccess().getElementsIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__ElementsAssignment_2"


    // $ANTLR start "rule__AddressTuple__ElementsAssignment_3_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5231:1: rule__AddressTuple__ElementsAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__AddressTuple__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5235:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5236:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5236:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5237:1: RULE_ID
            {
             before(grammarAccess.getAddressTupleAccess().getElementsIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddressTuple__ElementsAssignment_3_110438); 
             after(grammarAccess.getAddressTupleAccess().getElementsIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressTuple__ElementsAssignment_3_1"


    // $ANTLR start "rule__TosNetLinkBinding__PropertiesAssignment_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5246:1: rule__TosNetLinkBinding__PropertiesAssignment_2 : ( ruleLinkProperty ) ;
    public final void rule__TosNetLinkBinding__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5250:1: ( ( ruleLinkProperty ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5251:1: ( ruleLinkProperty )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5251:1: ( ruleLinkProperty )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5252:1: ruleLinkProperty
            {
             before(grammarAccess.getTosNetLinkBindingAccess().getPropertiesLinkPropertyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLinkProperty_in_rule__TosNetLinkBinding__PropertiesAssignment_210469);
            ruleLinkProperty();

            state._fsp--;

             after(grammarAccess.getTosNetLinkBindingAccess().getPropertiesLinkPropertyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__PropertiesAssignment_2"


    // $ANTLR start "rule__TosNetLinkBinding__PropertiesAssignment_3_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5261:1: rule__TosNetLinkBinding__PropertiesAssignment_3_1 : ( ruleLinkProperty ) ;
    public final void rule__TosNetLinkBinding__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5265:1: ( ( ruleLinkProperty ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5266:1: ( ruleLinkProperty )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5266:1: ( ruleLinkProperty )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5267:1: ruleLinkProperty
            {
             before(grammarAccess.getTosNetLinkBindingAccess().getPropertiesLinkPropertyParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleLinkProperty_in_rule__TosNetLinkBinding__PropertiesAssignment_3_110500);
            ruleLinkProperty();

            state._fsp--;

             after(grammarAccess.getTosNetLinkBindingAccess().getPropertiesLinkPropertyParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TosNetLinkBinding__PropertiesAssignment_3_1"


    // $ANTLR start "rule__LinkProperty__CtrlNameAssignment_0_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5276:1: rule__LinkProperty__CtrlNameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__LinkProperty__CtrlNameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5280:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5281:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5281:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5282:1: RULE_ID
            {
             before(grammarAccess.getLinkPropertyAccess().getCtrlNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LinkProperty__CtrlNameAssignment_0_210531); 
             after(grammarAccess.getLinkPropertyAccess().getCtrlNameIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__CtrlNameAssignment_0_2"


    // $ANTLR start "rule__LinkProperty__BaseValueAssignment_1_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5291:1: rule__LinkProperty__BaseValueAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__LinkProperty__BaseValueAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5295:1: ( ( RULE_INT ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5296:1: ( RULE_INT )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5296:1: ( RULE_INT )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5297:1: RULE_INT
            {
             before(grammarAccess.getLinkPropertyAccess().getBaseValueINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__LinkProperty__BaseValueAssignment_1_210562); 
             after(grammarAccess.getLinkPropertyAccess().getBaseValueINTTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__BaseValueAssignment_1_2"


    // $ANTLR start "rule__LinkProperty__UartNameAssignment_2_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5306:1: rule__LinkProperty__UartNameAssignment_2_2 : ( RULE_ID ) ;
    public final void rule__LinkProperty__UartNameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5310:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5311:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5311:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5312:1: RULE_ID
            {
             before(grammarAccess.getLinkPropertyAccess().getUartNameIDTerminalRuleCall_2_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LinkProperty__UartNameAssignment_2_210593); 
             after(grammarAccess.getLinkPropertyAccess().getUartNameIDTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LinkProperty__UartNameAssignment_2_2"


    // $ANTLR start "rule__SimpleExpansion__NameAssignment_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5321:1: rule__SimpleExpansion__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SimpleExpansion__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5325:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5326:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5326:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5327:1: RULE_ID
            {
             before(grammarAccess.getSimpleExpansionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleExpansion__NameAssignment_010624); 
             after(grammarAccess.getSimpleExpansionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__NameAssignment_0"


    // $ANTLR start "rule__SimpleExpansion__ConstructorAssignment_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5336:1: rule__SimpleExpansion__ConstructorAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__SimpleExpansion__ConstructorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5340:1: ( ( ( RULE_ID ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5341:1: ( ( RULE_ID ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5341:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5342:1: ( RULE_ID )
            {
             before(grammarAccess.getSimpleExpansionAccess().getConstructorConstructorCrossReference_2_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5343:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5344:1: RULE_ID
            {
             before(grammarAccess.getSimpleExpansionAccess().getConstructorConstructorIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleExpansion__ConstructorAssignment_210659); 
             after(grammarAccess.getSimpleExpansionAccess().getConstructorConstructorIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSimpleExpansionAccess().getConstructorConstructorCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__ConstructorAssignment_2"


    // $ANTLR start "rule__SimpleExpansion__ArgumentsAssignment_4_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5355:1: rule__SimpleExpansion__ArgumentsAssignment_4_0 : ( ruleArgument ) ;
    public final void rule__SimpleExpansion__ArgumentsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5359:1: ( ( ruleArgument ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5360:1: ( ruleArgument )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5360:1: ( ruleArgument )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5361:1: ruleArgument
            {
             before(grammarAccess.getSimpleExpansionAccess().getArgumentsArgumentParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__SimpleExpansion__ArgumentsAssignment_4_010694);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getSimpleExpansionAccess().getArgumentsArgumentParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__ArgumentsAssignment_4_0"


    // $ANTLR start "rule__SimpleExpansion__ArgumentsAssignment_4_1_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5370:1: rule__SimpleExpansion__ArgumentsAssignment_4_1_1 : ( ruleArgument ) ;
    public final void rule__SimpleExpansion__ArgumentsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5374:1: ( ( ruleArgument ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5375:1: ( ruleArgument )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5375:1: ( ruleArgument )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5376:1: ruleArgument
            {
             before(grammarAccess.getSimpleExpansionAccess().getArgumentsArgumentParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__SimpleExpansion__ArgumentsAssignment_4_1_110725);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getSimpleExpansionAccess().getArgumentsArgumentParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__ArgumentsAssignment_4_1_1"


    // $ANTLR start "rule__SimpleExpansion__BindingsAssignment_6_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5385:1: rule__SimpleExpansion__BindingsAssignment_6_0 : ( ruleAddressBinding ) ;
    public final void rule__SimpleExpansion__BindingsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5389:1: ( ( ruleAddressBinding ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5390:1: ( ruleAddressBinding )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5390:1: ( ruleAddressBinding )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5391:1: ruleAddressBinding
            {
             before(grammarAccess.getSimpleExpansionAccess().getBindingsAddressBindingParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_ruleAddressBinding_in_rule__SimpleExpansion__BindingsAssignment_6_010756);
            ruleAddressBinding();

            state._fsp--;

             after(grammarAccess.getSimpleExpansionAccess().getBindingsAddressBindingParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__BindingsAssignment_6_0"


    // $ANTLR start "rule__SimpleExpansion__BindingsAssignment_6_1_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5400:1: rule__SimpleExpansion__BindingsAssignment_6_1_1 : ( ruleAddressBinding ) ;
    public final void rule__SimpleExpansion__BindingsAssignment_6_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5404:1: ( ( ruleAddressBinding ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5405:1: ( ruleAddressBinding )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5405:1: ( ruleAddressBinding )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5406:1: ruleAddressBinding
            {
             before(grammarAccess.getSimpleExpansionAccess().getBindingsAddressBindingParserRuleCall_6_1_1_0()); 
            pushFollow(FOLLOW_ruleAddressBinding_in_rule__SimpleExpansion__BindingsAssignment_6_1_110787);
            ruleAddressBinding();

            state._fsp--;

             after(grammarAccess.getSimpleExpansionAccess().getBindingsAddressBindingParserRuleCall_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleExpansion__BindingsAssignment_6_1_1"


    // $ANTLR start "rule__AddressExpansion__NameAssignment_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5415:1: rule__AddressExpansion__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AddressExpansion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5419:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5420:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5420:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5421:1: RULE_ID
            {
             before(grammarAccess.getAddressExpansionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddressExpansion__NameAssignment_110818); 
             after(grammarAccess.getAddressExpansionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__NameAssignment_1"


    // $ANTLR start "rule__AddressExpansion__ConstructorAssignment_3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5430:1: rule__AddressExpansion__ConstructorAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__AddressExpansion__ConstructorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5434:1: ( ( ( RULE_ID ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5435:1: ( ( RULE_ID ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5435:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5436:1: ( RULE_ID )
            {
             before(grammarAccess.getAddressExpansionAccess().getConstructorConstructorCrossReference_3_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5437:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5438:1: RULE_ID
            {
             before(grammarAccess.getAddressExpansionAccess().getConstructorConstructorIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddressExpansion__ConstructorAssignment_310853); 
             after(grammarAccess.getAddressExpansionAccess().getConstructorConstructorIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAddressExpansionAccess().getConstructorConstructorCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__ConstructorAssignment_3"


    // $ANTLR start "rule__AddressExpansion__ArgumentsAssignment_5_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5449:1: rule__AddressExpansion__ArgumentsAssignment_5_0 : ( ruleArgument ) ;
    public final void rule__AddressExpansion__ArgumentsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5453:1: ( ( ruleArgument ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5454:1: ( ruleArgument )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5454:1: ( ruleArgument )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5455:1: ruleArgument
            {
             before(grammarAccess.getAddressExpansionAccess().getArgumentsArgumentParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__AddressExpansion__ArgumentsAssignment_5_010888);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getAddressExpansionAccess().getArgumentsArgumentParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__ArgumentsAssignment_5_0"


    // $ANTLR start "rule__AddressExpansion__ArgumentsAssignment_5_1_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5464:1: rule__AddressExpansion__ArgumentsAssignment_5_1_1 : ( ruleArgument ) ;
    public final void rule__AddressExpansion__ArgumentsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5468:1: ( ( ruleArgument ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5469:1: ( ruleArgument )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5469:1: ( ruleArgument )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5470:1: ruleArgument
            {
             before(grammarAccess.getAddressExpansionAccess().getArgumentsArgumentParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__AddressExpansion__ArgumentsAssignment_5_1_110919);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getAddressExpansionAccess().getArgumentsArgumentParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressExpansion__ArgumentsAssignment_5_1_1"


    // $ANTLR start "rule__Argument__SimpleAssignment_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5479:1: rule__Argument__SimpleAssignment_0 : ( RULE_ID ) ;
    public final void rule__Argument__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5483:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5484:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5484:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5485:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getSimpleIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__SimpleAssignment_010950); 
             after(grammarAccess.getArgumentAccess().getSimpleIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__SimpleAssignment_0"


    // $ANTLR start "rule__Argument__LhsAssignment_1_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5494:1: rule__Argument__LhsAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Argument__LhsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5498:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5499:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5499:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5500:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getLhsIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__LhsAssignment_1_010981); 
             after(grammarAccess.getArgumentAccess().getLhsIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__LhsAssignment_1_0"


    // $ANTLR start "rule__Argument__RhsAssignment_1_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5509:1: rule__Argument__RhsAssignment_1_2 : ( ruleArgument ) ;
    public final void rule__Argument__RhsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5513:1: ( ( ruleArgument ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5514:1: ( ruleArgument )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5514:1: ( ruleArgument )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5515:1: ruleArgument
            {
             before(grammarAccess.getArgumentAccess().getRhsArgumentParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__Argument__RhsAssignment_1_211012);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getArgumentAccess().getRhsArgumentParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__RhsAssignment_1_2"


    // $ANTLR start "rule__Argument__TextAssignment_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5524:1: rule__Argument__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Argument__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5528:1: ( ( RULE_STRING ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5529:1: ( RULE_STRING )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5529:1: ( RULE_STRING )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5530:1: RULE_STRING
            {
             before(grammarAccess.getArgumentAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Argument__TextAssignment_211043); 
             after(grammarAccess.getArgumentAccess().getTextSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Argument__TextAssignment_2"


    // $ANTLR start "rule__AddressBinding__NameAssignment_1_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5539:1: rule__AddressBinding__NameAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__AddressBinding__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5543:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5544:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5544:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5545:1: RULE_ID
            {
             before(grammarAccess.getAddressBindingAccess().getNameIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AddressBinding__NameAssignment_1_011074); 
             after(grammarAccess.getAddressBindingAccess().getNameIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__NameAssignment_1_0"


    // $ANTLR start "rule__AddressBinding__AddressesAssignment_3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5554:1: rule__AddressBinding__AddressesAssignment_3 : ( RULE_HEX_NUM ) ;
    public final void rule__AddressBinding__AddressesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5558:1: ( ( RULE_HEX_NUM ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5559:1: ( RULE_HEX_NUM )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5559:1: ( RULE_HEX_NUM )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5560:1: RULE_HEX_NUM
            {
             before(grammarAccess.getAddressBindingAccess().getAddressesHEX_NUMTerminalRuleCall_3_0()); 
            match(input,RULE_HEX_NUM,FOLLOW_RULE_HEX_NUM_in_rule__AddressBinding__AddressesAssignment_311105); 
             after(grammarAccess.getAddressBindingAccess().getAddressesHEX_NUMTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__AddressesAssignment_3"


    // $ANTLR start "rule__AddressBinding__AddressesAssignment_4_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5569:1: rule__AddressBinding__AddressesAssignment_4_1 : ( RULE_HEX_NUM ) ;
    public final void rule__AddressBinding__AddressesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5573:1: ( ( RULE_HEX_NUM ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5574:1: ( RULE_HEX_NUM )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5574:1: ( RULE_HEX_NUM )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5575:1: RULE_HEX_NUM
            {
             before(grammarAccess.getAddressBindingAccess().getAddressesHEX_NUMTerminalRuleCall_4_1_0()); 
            match(input,RULE_HEX_NUM,FOLLOW_RULE_HEX_NUM_in_rule__AddressBinding__AddressesAssignment_4_111136); 
             after(grammarAccess.getAddressBindingAccess().getAddressesHEX_NUMTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddressBinding__AddressesAssignment_4_1"


    // $ANTLR start "rule__Instantiation__AddressAssignment_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5584:1: rule__Instantiation__AddressAssignment_1 : ( ruleAddressSpec ) ;
    public final void rule__Instantiation__AddressAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5588:1: ( ( ruleAddressSpec ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5589:1: ( ruleAddressSpec )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5589:1: ( ruleAddressSpec )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5590:1: ruleAddressSpec
            {
             before(grammarAccess.getInstantiationAccess().getAddressAddressSpecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAddressSpec_in_rule__Instantiation__AddressAssignment_111167);
            ruleAddressSpec();

            state._fsp--;

             after(grammarAccess.getInstantiationAccess().getAddressAddressSpecParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__AddressAssignment_1"


    // $ANTLR start "rule__Instantiation__KindAssignment_3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5599:1: rule__Instantiation__KindAssignment_3 : ( ruleKind ) ;
    public final void rule__Instantiation__KindAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5603:1: ( ( ruleKind ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5604:1: ( ruleKind )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5604:1: ( ruleKind )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5605:1: ruleKind
            {
             before(grammarAccess.getInstantiationAccess().getKindKindParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleKind_in_rule__Instantiation__KindAssignment_311198);
            ruleKind();

            state._fsp--;

             after(grammarAccess.getInstantiationAccess().getKindKindParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__KindAssignment_3"


    // $ANTLR start "rule__Instantiation__PropertiesAssignment_5_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5614:1: rule__Instantiation__PropertiesAssignment_5_0 : ( ruleInstantiationProperty ) ;
    public final void rule__Instantiation__PropertiesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5618:1: ( ( ruleInstantiationProperty ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5619:1: ( ruleInstantiationProperty )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5619:1: ( ruleInstantiationProperty )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5620:1: ruleInstantiationProperty
            {
             before(grammarAccess.getInstantiationAccess().getPropertiesInstantiationPropertyParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleInstantiationProperty_in_rule__Instantiation__PropertiesAssignment_5_011229);
            ruleInstantiationProperty();

            state._fsp--;

             after(grammarAccess.getInstantiationAccess().getPropertiesInstantiationPropertyParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__PropertiesAssignment_5_0"


    // $ANTLR start "rule__Instantiation__PropertiesAssignment_5_1_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5629:1: rule__Instantiation__PropertiesAssignment_5_1_1 : ( ruleInstantiationProperty ) ;
    public final void rule__Instantiation__PropertiesAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5633:1: ( ( ruleInstantiationProperty ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5634:1: ( ruleInstantiationProperty )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5634:1: ( ruleInstantiationProperty )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5635:1: ruleInstantiationProperty
            {
             before(grammarAccess.getInstantiationAccess().getPropertiesInstantiationPropertyParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_ruleInstantiationProperty_in_rule__Instantiation__PropertiesAssignment_5_1_111260);
            ruleInstantiationProperty();

            state._fsp--;

             after(grammarAccess.getInstantiationAccess().getPropertiesInstantiationPropertyParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__PropertiesAssignment_5_1_1"


    // $ANTLR start "rule__DirectAddressSpec__NameAssignment_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5644:1: rule__DirectAddressSpec__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__DirectAddressSpec__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5648:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5649:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5649:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5650:1: RULE_ID
            {
             before(grammarAccess.getDirectAddressSpecAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DirectAddressSpec__NameAssignment_011291); 
             after(grammarAccess.getDirectAddressSpecAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectAddressSpec__NameAssignment_0"


    // $ANTLR start "rule__DirectAddressSpec__AddressAssignment_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5659:1: rule__DirectAddressSpec__AddressAssignment_2 : ( RULE_HEX_NUM ) ;
    public final void rule__DirectAddressSpec__AddressAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5663:1: ( ( RULE_HEX_NUM ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5664:1: ( RULE_HEX_NUM )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5664:1: ( RULE_HEX_NUM )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5665:1: RULE_HEX_NUM
            {
             before(grammarAccess.getDirectAddressSpecAccess().getAddressHEX_NUMTerminalRuleCall_2_0()); 
            match(input,RULE_HEX_NUM,FOLLOW_RULE_HEX_NUM_in_rule__DirectAddressSpec__AddressAssignment_211322); 
             after(grammarAccess.getDirectAddressSpecAccess().getAddressHEX_NUMTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectAddressSpec__AddressAssignment_2"


    // $ANTLR start "rule__NamedAddressSpec__NameAssignment"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5674:1: rule__NamedAddressSpec__NameAssignment : ( RULE_ID ) ;
    public final void rule__NamedAddressSpec__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5678:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5679:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5679:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5680:1: RULE_ID
            {
             before(grammarAccess.getNamedAddressSpecAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamedAddressSpec__NameAssignment11353); 
             after(grammarAccess.getNamedAddressSpecAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NamedAddressSpec__NameAssignment"


    // $ANTLR start "rule__InstantiationProperty__IdAssignment_0_3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5689:1: rule__InstantiationProperty__IdAssignment_0_3 : ( ruleArgument ) ;
    public final void rule__InstantiationProperty__IdAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5693:1: ( ( ruleArgument ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5694:1: ( ruleArgument )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5694:1: ( ruleArgument )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5695:1: ruleArgument
            {
             before(grammarAccess.getInstantiationPropertyAccess().getIdArgumentParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_ruleArgument_in_rule__InstantiationProperty__IdAssignment_0_311384);
            ruleArgument();

            state._fsp--;

             after(grammarAccess.getInstantiationPropertyAccess().getIdArgumentParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__IdAssignment_0_3"


    // $ANTLR start "rule__InstantiationProperty__ModeAssignment_2_3"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5704:1: rule__InstantiationProperty__ModeAssignment_2_3 : ( RULE_INT ) ;
    public final void rule__InstantiationProperty__ModeAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5708:1: ( ( RULE_INT ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5709:1: ( RULE_INT )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5709:1: ( RULE_INT )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5710:1: RULE_INT
            {
             before(grammarAccess.getInstantiationPropertyAccess().getModeINTTerminalRuleCall_2_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InstantiationProperty__ModeAssignment_2_311415); 
             after(grammarAccess.getInstantiationPropertyAccess().getModeINTTerminalRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__ModeAssignment_2_3"


    // $ANTLR start "rule__InstantiationProperty__RateAssignment_2_5"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5719:1: rule__InstantiationProperty__RateAssignment_2_5 : ( RULE_INT ) ;
    public final void rule__InstantiationProperty__RateAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5723:1: ( ( RULE_INT ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5724:1: ( RULE_INT )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5724:1: ( RULE_INT )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5725:1: RULE_INT
            {
             before(grammarAccess.getInstantiationPropertyAccess().getRateINTTerminalRuleCall_2_5_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__InstantiationProperty__RateAssignment_2_511446); 
             after(grammarAccess.getInstantiationPropertyAccess().getRateINTTerminalRuleCall_2_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstantiationProperty__RateAssignment_2_5"


    // $ANTLR start "rule__Grouping__NameAssignment_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5734:1: rule__Grouping__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Grouping__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5738:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5739:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5739:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5740:1: RULE_ID
            {
             before(grammarAccess.getGroupingAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Grouping__NameAssignment_011477); 
             after(grammarAccess.getGroupingAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__NameAssignment_0"


    // $ANTLR start "rule__Grouping__ElementsAssignment_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5749:1: rule__Grouping__ElementsAssignment_2 : ( ruleGroupElement ) ;
    public final void rule__Grouping__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5753:1: ( ( ruleGroupElement ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5754:1: ( ruleGroupElement )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5754:1: ( ruleGroupElement )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5755:1: ruleGroupElement
            {
             before(grammarAccess.getGroupingAccess().getElementsGroupElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGroupElement_in_rule__Grouping__ElementsAssignment_211508);
            ruleGroupElement();

            state._fsp--;

             after(grammarAccess.getGroupingAccess().getElementsGroupElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__ElementsAssignment_2"


    // $ANTLR start "rule__Grouping__ElementsAssignment_3_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5764:1: rule__Grouping__ElementsAssignment_3_1 : ( ruleGroupElement ) ;
    public final void rule__Grouping__ElementsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5768:1: ( ( ruleGroupElement ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5769:1: ( ruleGroupElement )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5769:1: ( ruleGroupElement )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5770:1: ruleGroupElement
            {
             before(grammarAccess.getGroupingAccess().getElementsGroupElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleGroupElement_in_rule__Grouping__ElementsAssignment_3_111539);
            ruleGroupElement();

            state._fsp--;

             after(grammarAccess.getGroupingAccess().getElementsGroupElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__ElementsAssignment_3_1"


    // $ANTLR start "rule__GroupElement__PathAssignment_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5779:1: rule__GroupElement__PathAssignment_0 : ( rulePathElement ) ;
    public final void rule__GroupElement__PathAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5783:1: ( ( rulePathElement ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5784:1: ( rulePathElement )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5784:1: ( rulePathElement )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5785:1: rulePathElement
            {
             before(grammarAccess.getGroupElementAccess().getPathPathElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePathElement_in_rule__GroupElement__PathAssignment_011570);
            rulePathElement();

            state._fsp--;

             after(grammarAccess.getGroupElementAccess().getPathPathElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupElement__PathAssignment_0"


    // $ANTLR start "rule__GroupElement__PathAssignment_1_1"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5794:1: rule__GroupElement__PathAssignment_1_1 : ( rulePathElement ) ;
    public final void rule__GroupElement__PathAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5798:1: ( ( rulePathElement ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5799:1: ( rulePathElement )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5799:1: ( rulePathElement )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5800:1: rulePathElement
            {
             before(grammarAccess.getGroupElementAccess().getPathPathElementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePathElement_in_rule__GroupElement__PathAssignment_1_111601);
            rulePathElement();

            state._fsp--;

             after(grammarAccess.getGroupElementAccess().getPathPathElementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroupElement__PathAssignment_1_1"


    // $ANTLR start "rule__PathElement__SimpleAssignment_0"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5809:1: rule__PathElement__SimpleAssignment_0 : ( RULE_ID ) ;
    public final void rule__PathElement__SimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5813:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5814:1: ( RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5814:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5815:1: RULE_ID
            {
             before(grammarAccess.getPathElementAccess().getSimpleIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PathElement__SimpleAssignment_011632); 
             after(grammarAccess.getPathElementAccess().getSimpleIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__SimpleAssignment_0"


    // $ANTLR start "rule__PathElement__TypeAssignment_1_2"
    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5824:1: rule__PathElement__TypeAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__PathElement__TypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5828:1: ( ( ( RULE_ID ) ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5829:1: ( ( RULE_ID ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5829:1: ( ( RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5830:1: ( RULE_ID )
            {
             before(grammarAccess.getPathElementAccess().getTypeConstructorCrossReference_1_2_0()); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5831:1: ( RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5832:1: RULE_ID
            {
             before(grammarAccess.getPathElementAccess().getTypeConstructorIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PathElement__TypeAssignment_1_211667); 
             after(grammarAccess.getPathElementAccess().getTypeConstructorIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getPathElementAccess().getTypeConstructorCrossReference_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathElement__TypeAssignment_1_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleLinkSpec_in_entryRuleLinkSpec61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkSpec68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkSpec__Group__0_in_ruleLinkSpec94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__0_in_ruleConstructor154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructorAddressParameters_in_entryRuleConstructorAddressParameters181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructorAddressParameters188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstructorAddressParameters__Alternatives_in_ruleConstructorAddressParameters214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedAddresses_in_entryRuleNamedAddresses241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedAddresses248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group__0_in_ruleNamedAddresses274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressTuple_in_entryRuleAddressTuple301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressTuple308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group__0_in_ruleAddressTuple334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Member__Alternatives_in_ruleMember394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkBinding_in_entryRuleLinkBinding421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkBinding428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTosNetLinkBinding_in_ruleLinkBinding454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTosNetLinkBinding_in_entryRuleTosNetLinkBinding480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTosNetLinkBinding487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group__0_in_ruleTosNetLinkBinding513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkProperty_in_entryRuleLinkProperty540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkProperty547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Alternatives_in_ruleLinkProperty573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpansion_in_entryRuleExpansion600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpansion607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expansion__Alternatives_in_ruleExpansion633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpansion_in_entryRuleSimpleExpansion660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpansion667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__0_in_ruleSimpleExpansion693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressExpansion_in_entryRuleAddressExpansion720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressExpansion727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__0_in_ruleAddressExpansion753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Alternatives_in_ruleArgument813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressBinding_in_entryRuleAddressBinding840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressBinding847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__0_in_ruleAddressBinding873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiation_in_entryRuleInstantiation900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstantiation907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__0_in_ruleInstantiation933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressSpec_in_entryRuleAddressSpec960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressSpec967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressSpec__Alternatives_in_ruleAddressSpec993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectAddressSpec_in_entryRuleDirectAddressSpec1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectAddressSpec1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectAddressSpec__Group__0_in_ruleDirectAddressSpec1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedAddressSpec_in_entryRuleNamedAddressSpec1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedAddressSpec1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedAddressSpec__NameAssignment_in_ruleNamedAddressSpec1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKind_in_entryRuleKind1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKind1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Kind__Alternatives_in_ruleKind1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiationProperty_in_entryRuleInstantiationProperty1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstantiationProperty1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Alternatives_in_ruleInstantiationProperty1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_entryRuleGrouping1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrouping1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__0_in_ruleGrouping1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupElement_in_entryRuleGroupElement1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupElement1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupElement__Group__0_in_ruleGroupElement1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathElement_in_entryRulePathElement1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathElement1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathElement__Alternatives_in_rulePathElement1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedAddresses_in_rule__ConstructorAddressParameters__Alternatives1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressTuple_in_rule__ConstructorAddressParameters__Alternatives1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkBinding_in_rule__Member__Alternatives1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpansion_in_rule__Member__Alternatives1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiation_in_rule__Member__Alternatives1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_rule__Member__Alternatives1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_0__0_in_rule__LinkProperty__Alternatives1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_1__0_in_rule__LinkProperty__Alternatives1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_2__0_in_rule__LinkProperty__Alternatives1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpansion_in_rule__Expansion__Alternatives1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressExpansion_in_rule__Expansion__Alternatives1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__SimpleAssignment_0_in_rule__Argument__Alternatives1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_1__0_in_rule__Argument__Alternatives1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__TextAssignment_2_in_rule__Argument__Alternatives1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectAddressSpec_in_rule__AddressSpec__Alternatives1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedAddressSpec_in_rule__AddressSpec__Alternatives1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Kind__Alternatives1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Kind__Alternatives1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_0__0_in_rule__InstantiationProperty__Alternatives1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_1__0_in_rule__InstantiationProperty__Alternatives1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__0_in_rule__InstantiationProperty__Alternatives1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathElement__SimpleAssignment_0_in_rule__PathElement__Alternatives1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathElement__Group_1__0_in_rule__PathElement__Alternatives1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkSpec__Group__0__Impl_in_rule__LinkSpec__Group__01990 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LinkSpec__Group__1_in_rule__LinkSpec__Group__01993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__LinkSpec__Group__0__Impl2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkSpec__Group__1__Impl_in_rule__LinkSpec__Group__12052 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__LinkSpec__Group__2_in_rule__LinkSpec__Group__12055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkSpec__NameAssignment_1_in_rule__LinkSpec__Group__1__Impl2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkSpec__Group__2__Impl_in_rule__LinkSpec__Group__22112 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__LinkSpec__Group__3_in_rule__LinkSpec__Group__22115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__LinkSpec__Group__2__Impl2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkSpec__Group__3__Impl_in_rule__LinkSpec__Group__32174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkSpec__ConstructorsAssignment_3_in_rule__LinkSpec__Group__3__Impl2201 = new BitSet(new long[]{0x0000000400000012L});
    public static final BitSet FOLLOW_rule__Constructor__Group__0__Impl_in_rule__Constructor__Group__02240 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__Constructor__Group__1_in_rule__Constructor__Group__02243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__IsPublicAssignment_0_in_rule__Constructor__Group__0__Impl2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__1__Impl_in_rule__Constructor__Group__12301 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Constructor__Group__2_in_rule__Constructor__Group__12304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__NameAssignment_1_in_rule__Constructor__Group__1__Impl2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__2__Impl_in_rule__Constructor__Group__22361 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__Constructor__Group__3_in_rule__Constructor__Group__22364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Constructor__Group__2__Impl2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__3__Impl_in_rule__Constructor__Group__32423 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_rule__Constructor__Group__4_in_rule__Constructor__Group__32426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_3__0_in_rule__Constructor__Group__3__Impl2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__4__Impl_in_rule__Constructor__Group__42484 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__Constructor__Group__5_in_rule__Constructor__Group__42487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Constructor__Group__4__Impl2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__5__Impl_in_rule__Constructor__Group__52546 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_rule__Constructor__Group__6_in_rule__Constructor__Group__52549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_5__0_in_rule__Constructor__Group__5__Impl2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__6__Impl_in_rule__Constructor__Group__62607 = new BitSet(new long[]{0x0000000000C80010L});
    public static final BitSet FOLLOW_rule__Constructor__Group__7_in_rule__Constructor__Group__62610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Constructor__Group__6__Impl2638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group__7__Impl_in_rule__Constructor__Group__72669 = new BitSet(new long[]{0x0000000000C80010L});
    public static final BitSet FOLLOW_rule__Constructor__Group__8_in_rule__Constructor__Group__72672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_7__0_in_rule__Constructor__Group__7__Impl2699 = new BitSet(new long[]{0x0000000000C00012L});
    public static final BitSet FOLLOW_rule__Constructor__Group__8__Impl_in_rule__Constructor__Group__82730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Constructor__Group__8__Impl2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_3__0__Impl_in_rule__Constructor__Group_3__02807 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Constructor__Group_3__1_in_rule__Constructor__Group_3__02810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__ParametersAssignment_3_0_in_rule__Constructor__Group_3__0__Impl2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_3__1__Impl_in_rule__Constructor__Group_3__12867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_3_1__0_in_rule__Constructor__Group_3__1__Impl2894 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_3_1__0__Impl_in_rule__Constructor__Group_3_1__02929 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Constructor__Group_3_1__1_in_rule__Constructor__Group_3_1__02932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Constructor__Group_3_1__0__Impl2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_3_1__1__Impl_in_rule__Constructor__Group_3_1__12991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__ParametersAssignment_3_1_1_in_rule__Constructor__Group_3_1__1__Impl3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_5__0__Impl_in_rule__Constructor__Group_5__03052 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Constructor__Group_5__1_in_rule__Constructor__Group_5__03055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Constructor__Group_5__0__Impl3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_5__1__Impl_in_rule__Constructor__Group_5__13114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__AddressesAssignment_5_1_in_rule__Constructor__Group_5__1__Impl3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_7__0__Impl_in_rule__Constructor__Group_7__03175 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Constructor__Group_7__1_in_rule__Constructor__Group_7__03178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__MembersAssignment_7_0_in_rule__Constructor__Group_7__0__Impl3205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constructor__Group_7__1__Impl_in_rule__Constructor__Group_7__13235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Constructor__Group_7__1__Impl3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group__0__Impl_in_rule__NamedAddresses__Group__03298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group__1_in_rule__NamedAddresses__Group__03301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__NamedAddresses__Group__0__Impl3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group__1__Impl_in_rule__NamedAddresses__Group__13360 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group__2_in_rule__NamedAddresses__Group__13363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedAddresses__AddressNamesAssignment_1_in_rule__NamedAddresses__Group__1__Impl3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group__2__Impl_in_rule__NamedAddresses__Group__23420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group_2__0_in_rule__NamedAddresses__Group__2__Impl3447 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group_2__0__Impl_in_rule__NamedAddresses__Group_2__03484 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group_2__1_in_rule__NamedAddresses__Group_2__03487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__NamedAddresses__Group_2__0__Impl3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group_2__1__Impl_in_rule__NamedAddresses__Group_2__13546 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group_2__2_in_rule__NamedAddresses__Group_2__13549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__NamedAddresses__Group_2__1__Impl3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedAddresses__Group_2__2__Impl_in_rule__NamedAddresses__Group_2__23608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedAddresses__AddressNamesAssignment_2_2_in_rule__NamedAddresses__Group_2__2__Impl3635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group__0__Impl_in_rule__AddressTuple__Group__03671 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group__1_in_rule__AddressTuple__Group__03674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__AddressTuple__Group__0__Impl3702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group__1__Impl_in_rule__AddressTuple__Group__13733 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group__2_in_rule__AddressTuple__Group__13736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AddressTuple__Group__1__Impl3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group__2__Impl_in_rule__AddressTuple__Group__23795 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group__3_in_rule__AddressTuple__Group__23798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressTuple__ElementsAssignment_2_in_rule__AddressTuple__Group__2__Impl3825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group__3__Impl_in_rule__AddressTuple__Group__33855 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group__4_in_rule__AddressTuple__Group__33858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group_3__0_in_rule__AddressTuple__Group__3__Impl3885 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group__4__Impl_in_rule__AddressTuple__Group__43916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AddressTuple__Group__4__Impl3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group_3__0__Impl_in_rule__AddressTuple__Group_3__03985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group_3__1_in_rule__AddressTuple__Group_3__03988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__AddressTuple__Group_3__0__Impl4016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressTuple__Group_3__1__Impl_in_rule__AddressTuple__Group_3__14047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressTuple__ElementsAssignment_3_1_in_rule__AddressTuple__Group_3__1__Impl4074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group__0__Impl_in_rule__TosNetLinkBinding__Group__04108 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group__1_in_rule__TosNetLinkBinding__Group__04111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TosNetLinkBinding__Group__0__Impl4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group__1__Impl_in_rule__TosNetLinkBinding__Group__14170 = new BitSet(new long[]{0x000000000D000000L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group__2_in_rule__TosNetLinkBinding__Group__14173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TosNetLinkBinding__Group__1__Impl4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group__2__Impl_in_rule__TosNetLinkBinding__Group__24232 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group__3_in_rule__TosNetLinkBinding__Group__24235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__PropertiesAssignment_2_in_rule__TosNetLinkBinding__Group__2__Impl4262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group__3__Impl_in_rule__TosNetLinkBinding__Group__34292 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group__4_in_rule__TosNetLinkBinding__Group__34295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group_3__0_in_rule__TosNetLinkBinding__Group__3__Impl4322 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group__4__Impl_in_rule__TosNetLinkBinding__Group__44353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TosNetLinkBinding__Group__4__Impl4381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group_3__0__Impl_in_rule__TosNetLinkBinding__Group_3__04422 = new BitSet(new long[]{0x000000000D000000L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group_3__1_in_rule__TosNetLinkBinding__Group_3__04425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__TosNetLinkBinding__Group_3__0__Impl4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__Group_3__1__Impl_in_rule__TosNetLinkBinding__Group_3__14484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TosNetLinkBinding__PropertiesAssignment_3_1_in_rule__TosNetLinkBinding__Group_3__1__Impl4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_0__0__Impl_in_rule__LinkProperty__Group_0__04545 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_0__1_in_rule__LinkProperty__Group_0__04548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LinkProperty__Group_0__0__Impl4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_0__1__Impl_in_rule__LinkProperty__Group_0__14607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_0__2_in_rule__LinkProperty__Group_0__14610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__LinkProperty__Group_0__1__Impl4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_0__2__Impl_in_rule__LinkProperty__Group_0__24669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__CtrlNameAssignment_0_2_in_rule__LinkProperty__Group_0__2__Impl4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_1__0__Impl_in_rule__LinkProperty__Group_1__04732 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_1__1_in_rule__LinkProperty__Group_1__04735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__LinkProperty__Group_1__0__Impl4763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_1__1__Impl_in_rule__LinkProperty__Group_1__14794 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_1__2_in_rule__LinkProperty__Group_1__14797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__LinkProperty__Group_1__1__Impl4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_1__2__Impl_in_rule__LinkProperty__Group_1__24856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__BaseValueAssignment_1_2_in_rule__LinkProperty__Group_1__2__Impl4883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_2__0__Impl_in_rule__LinkProperty__Group_2__04919 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_2__1_in_rule__LinkProperty__Group_2__04922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__LinkProperty__Group_2__0__Impl4950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_2__1__Impl_in_rule__LinkProperty__Group_2__14981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_2__2_in_rule__LinkProperty__Group_2__14984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__LinkProperty__Group_2__1__Impl5012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__Group_2__2__Impl_in_rule__LinkProperty__Group_2__25043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkProperty__UartNameAssignment_2_2_in_rule__LinkProperty__Group_2__2__Impl5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__0__Impl_in_rule__SimpleExpansion__Group__05106 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__1_in_rule__SimpleExpansion__Group__05109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__NameAssignment_0_in_rule__SimpleExpansion__Group__0__Impl5136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__1__Impl_in_rule__SimpleExpansion__Group__15166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__2_in_rule__SimpleExpansion__Group__15169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SimpleExpansion__Group__1__Impl5197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__2__Impl_in_rule__SimpleExpansion__Group__25228 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__3_in_rule__SimpleExpansion__Group__25231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__ConstructorAssignment_2_in_rule__SimpleExpansion__Group__2__Impl5258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__3__Impl_in_rule__SimpleExpansion__Group__35288 = new BitSet(new long[]{0x0000000000020050L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__4_in_rule__SimpleExpansion__Group__35291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__SimpleExpansion__Group__3__Impl5319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__4__Impl_in_rule__SimpleExpansion__Group__45350 = new BitSet(new long[]{0x0000000000020050L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__5_in_rule__SimpleExpansion__Group__45353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_4__0_in_rule__SimpleExpansion__Group__4__Impl5380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__5__Impl_in_rule__SimpleExpansion__Group__55411 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__6_in_rule__SimpleExpansion__Group__55414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__SimpleExpansion__Group__5__Impl5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group__6__Impl_in_rule__SimpleExpansion__Group__65473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_6__0_in_rule__SimpleExpansion__Group__6__Impl5500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_4__0__Impl_in_rule__SimpleExpansion__Group_4__05545 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_4__1_in_rule__SimpleExpansion__Group_4__05548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__ArgumentsAssignment_4_0_in_rule__SimpleExpansion__Group_4__0__Impl5575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_4__1__Impl_in_rule__SimpleExpansion__Group_4__15605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_4_1__0_in_rule__SimpleExpansion__Group_4__1__Impl5632 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_4_1__0__Impl_in_rule__SimpleExpansion__Group_4_1__05667 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_4_1__1_in_rule__SimpleExpansion__Group_4_1__05670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SimpleExpansion__Group_4_1__0__Impl5698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_4_1__1__Impl_in_rule__SimpleExpansion__Group_4_1__15729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__ArgumentsAssignment_4_1_1_in_rule__SimpleExpansion__Group_4_1__1__Impl5756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_6__0__Impl_in_rule__SimpleExpansion__Group_6__05790 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_6__1_in_rule__SimpleExpansion__Group_6__05793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__BindingsAssignment_6_0_in_rule__SimpleExpansion__Group_6__0__Impl5820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_6__1__Impl_in_rule__SimpleExpansion__Group_6__15850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_6_1__0_in_rule__SimpleExpansion__Group_6__1__Impl5877 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_6_1__0__Impl_in_rule__SimpleExpansion__Group_6_1__05912 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_6_1__1_in_rule__SimpleExpansion__Group_6_1__05915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SimpleExpansion__Group_6_1__0__Impl5943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__Group_6_1__1__Impl_in_rule__SimpleExpansion__Group_6_1__15974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleExpansion__BindingsAssignment_6_1_1_in_rule__SimpleExpansion__Group_6_1__1__Impl6001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__0__Impl_in_rule__AddressExpansion__Group__06035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__1_in_rule__AddressExpansion__Group__06038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__AddressExpansion__Group__0__Impl6066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__1__Impl_in_rule__AddressExpansion__Group__16097 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__2_in_rule__AddressExpansion__Group__16100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__NameAssignment_1_in_rule__AddressExpansion__Group__1__Impl6127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__2__Impl_in_rule__AddressExpansion__Group__26157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__3_in_rule__AddressExpansion__Group__26160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AddressExpansion__Group__2__Impl6188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__3__Impl_in_rule__AddressExpansion__Group__36219 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__4_in_rule__AddressExpansion__Group__36222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__ConstructorAssignment_3_in_rule__AddressExpansion__Group__3__Impl6249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__4__Impl_in_rule__AddressExpansion__Group__46279 = new BitSet(new long[]{0x0000000000020050L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__5_in_rule__AddressExpansion__Group__46282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AddressExpansion__Group__4__Impl6310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__5__Impl_in_rule__AddressExpansion__Group__56341 = new BitSet(new long[]{0x0000000000020050L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__6_in_rule__AddressExpansion__Group__56344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group_5__0_in_rule__AddressExpansion__Group__5__Impl6371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group__6__Impl_in_rule__AddressExpansion__Group__66402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AddressExpansion__Group__6__Impl6430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group_5__0__Impl_in_rule__AddressExpansion__Group_5__06475 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group_5__1_in_rule__AddressExpansion__Group_5__06478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__ArgumentsAssignment_5_0_in_rule__AddressExpansion__Group_5__0__Impl6505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group_5__1__Impl_in_rule__AddressExpansion__Group_5__16535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group_5_1__0_in_rule__AddressExpansion__Group_5__1__Impl6562 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group_5_1__0__Impl_in_rule__AddressExpansion__Group_5_1__06597 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group_5_1__1_in_rule__AddressExpansion__Group_5_1__06600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__AddressExpansion__Group_5_1__0__Impl6628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__Group_5_1__1__Impl_in_rule__AddressExpansion__Group_5_1__16659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressExpansion__ArgumentsAssignment_5_1_1_in_rule__AddressExpansion__Group_5_1__1__Impl6686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_1__0__Impl_in_rule__Argument__Group_1__06720 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Argument__Group_1__1_in_rule__Argument__Group_1__06723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__LhsAssignment_1_0_in_rule__Argument__Group_1__0__Impl6750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_1__1__Impl_in_rule__Argument__Group_1__16780 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Argument__Group_1__2_in_rule__Argument__Group_1__16783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Argument__Group_1__1__Impl6811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group_1__2__Impl_in_rule__Argument__Group_1__26842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__RhsAssignment_1_2_in_rule__Argument__Group_1__2__Impl6869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__0__Impl_in_rule__AddressBinding__Group__06905 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__1_in_rule__AddressBinding__Group__06908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__AddressBinding__Group__0__Impl6936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__1__Impl_in_rule__AddressBinding__Group__16967 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__2_in_rule__AddressBinding__Group__16970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group_1__0_in_rule__AddressBinding__Group__1__Impl6997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__2__Impl_in_rule__AddressBinding__Group__27028 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__3_in_rule__AddressBinding__Group__27031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AddressBinding__Group__2__Impl7059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__3__Impl_in_rule__AddressBinding__Group__37090 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__4_in_rule__AddressBinding__Group__37093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__AddressesAssignment_3_in_rule__AddressBinding__Group__3__Impl7120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__4__Impl_in_rule__AddressBinding__Group__47150 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__5_in_rule__AddressBinding__Group__47153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group_4__0_in_rule__AddressBinding__Group__4__Impl7180 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group__5__Impl_in_rule__AddressBinding__Group__57211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AddressBinding__Group__5__Impl7239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group_1__0__Impl_in_rule__AddressBinding__Group_1__07282 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group_1__1_in_rule__AddressBinding__Group_1__07285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__NameAssignment_1_0_in_rule__AddressBinding__Group_1__0__Impl7312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group_1__1__Impl_in_rule__AddressBinding__Group_1__17342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__AddressBinding__Group_1__1__Impl7370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group_4__0__Impl_in_rule__AddressBinding__Group_4__07405 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group_4__1_in_rule__AddressBinding__Group_4__07408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__AddressBinding__Group_4__0__Impl7436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__Group_4__1__Impl_in_rule__AddressBinding__Group_4__17467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddressBinding__AddressesAssignment_4_1_in_rule__AddressBinding__Group_4__1__Impl7494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__0__Impl_in_rule__Instantiation__Group__07528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__1_in_rule__Instantiation__Group__07531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Instantiation__Group__0__Impl7559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__1__Impl_in_rule__Instantiation__Group__17590 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__2_in_rule__Instantiation__Group__17593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__AddressAssignment_1_in_rule__Instantiation__Group__1__Impl7620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__2__Impl_in_rule__Instantiation__Group__27650 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__3_in_rule__Instantiation__Group__27653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Instantiation__Group__2__Impl7681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__3__Impl_in_rule__Instantiation__Group__37712 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__4_in_rule__Instantiation__Group__37715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__KindAssignment_3_in_rule__Instantiation__Group__3__Impl7742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__4__Impl_in_rule__Instantiation__Group__47772 = new BitSet(new long[]{0x00000000E0020000L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__5_in_rule__Instantiation__Group__47775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Instantiation__Group__4__Impl7803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__5__Impl_in_rule__Instantiation__Group__57834 = new BitSet(new long[]{0x00000000E0020000L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__6_in_rule__Instantiation__Group__57837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group_5__0_in_rule__Instantiation__Group__5__Impl7864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group__6__Impl_in_rule__Instantiation__Group__67895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Instantiation__Group__6__Impl7923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group_5__0__Impl_in_rule__Instantiation__Group_5__07968 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Instantiation__Group_5__1_in_rule__Instantiation__Group_5__07971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__PropertiesAssignment_5_0_in_rule__Instantiation__Group_5__0__Impl7998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group_5__1__Impl_in_rule__Instantiation__Group_5__18028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group_5_1__0_in_rule__Instantiation__Group_5__1__Impl8055 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group_5_1__0__Impl_in_rule__Instantiation__Group_5_1__08090 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_rule__Instantiation__Group_5_1__1_in_rule__Instantiation__Group_5_1__08093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Instantiation__Group_5_1__0__Impl8121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__Group_5_1__1__Impl_in_rule__Instantiation__Group_5_1__18152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Instantiation__PropertiesAssignment_5_1_1_in_rule__Instantiation__Group_5_1__1__Impl8179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectAddressSpec__Group__0__Impl_in_rule__DirectAddressSpec__Group__08213 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__DirectAddressSpec__Group__1_in_rule__DirectAddressSpec__Group__08216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectAddressSpec__NameAssignment_0_in_rule__DirectAddressSpec__Group__0__Impl8243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectAddressSpec__Group__1__Impl_in_rule__DirectAddressSpec__Group__18273 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__DirectAddressSpec__Group__2_in_rule__DirectAddressSpec__Group__18276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DirectAddressSpec__Group__1__Impl8304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectAddressSpec__Group__2__Impl_in_rule__DirectAddressSpec__Group__28335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DirectAddressSpec__AddressAssignment_2_in_rule__DirectAddressSpec__Group__2__Impl8362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_0__0__Impl_in_rule__InstantiationProperty__Group_0__08398 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_0__1_in_rule__InstantiationProperty__Group_0__08401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_0__1__Impl_in_rule__InstantiationProperty__Group_0__18459 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_0__2_in_rule__InstantiationProperty__Group_0__18462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__InstantiationProperty__Group_0__1__Impl8490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_0__2__Impl_in_rule__InstantiationProperty__Group_0__28521 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_0__3_in_rule__InstantiationProperty__Group_0__28524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__InstantiationProperty__Group_0__2__Impl8552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_0__3__Impl_in_rule__InstantiationProperty__Group_0__38583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__IdAssignment_0_3_in_rule__InstantiationProperty__Group_0__3__Impl8610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_1__0__Impl_in_rule__InstantiationProperty__Group_1__08648 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_1__1_in_rule__InstantiationProperty__Group_1__08651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_1__1__Impl_in_rule__InstantiationProperty__Group_1__18709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__InstantiationProperty__Group_1__1__Impl8737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__0__Impl_in_rule__InstantiationProperty__Group_2__08772 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__1_in_rule__InstantiationProperty__Group_2__08775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__1__Impl_in_rule__InstantiationProperty__Group_2__18833 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__2_in_rule__InstantiationProperty__Group_2__18836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__InstantiationProperty__Group_2__1__Impl8864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__2__Impl_in_rule__InstantiationProperty__Group_2__28895 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__3_in_rule__InstantiationProperty__Group_2__28898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__InstantiationProperty__Group_2__2__Impl8926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__3__Impl_in_rule__InstantiationProperty__Group_2__38957 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__4_in_rule__InstantiationProperty__Group_2__38960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__ModeAssignment_2_3_in_rule__InstantiationProperty__Group_2__3__Impl8987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__4__Impl_in_rule__InstantiationProperty__Group_2__49017 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__5_in_rule__InstantiationProperty__Group_2__49020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__InstantiationProperty__Group_2__4__Impl9048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__5__Impl_in_rule__InstantiationProperty__Group_2__59079 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__6_in_rule__InstantiationProperty__Group_2__59082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__RateAssignment_2_5_in_rule__InstantiationProperty__Group_2__5__Impl9109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstantiationProperty__Group_2__6__Impl_in_rule__InstantiationProperty__Group_2__69139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__InstantiationProperty__Group_2__6__Impl9167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__0__Impl_in_rule__Grouping__Group__09212 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Grouping__Group__1_in_rule__Grouping__Group__09215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__NameAssignment_0_in_rule__Grouping__Group__0__Impl9242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__1__Impl_in_rule__Grouping__Group__19272 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__Grouping__Group__2_in_rule__Grouping__Group__19275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Grouping__Group__1__Impl9303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__2__Impl_in_rule__Grouping__Group__29334 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Grouping__Group__3_in_rule__Grouping__Group__29337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__ElementsAssignment_2_in_rule__Grouping__Group__2__Impl9364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__3__Impl_in_rule__Grouping__Group__39394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group_3__0_in_rule__Grouping__Group__3__Impl9421 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__Grouping__Group_3__0__Impl_in_rule__Grouping__Group_3__09460 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__Grouping__Group_3__1_in_rule__Grouping__Group_3__09463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Grouping__Group_3__0__Impl9491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group_3__1__Impl_in_rule__Grouping__Group_3__19522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__ElementsAssignment_3_1_in_rule__Grouping__Group_3__1__Impl9549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupElement__Group__0__Impl_in_rule__GroupElement__Group__09583 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__GroupElement__Group__1_in_rule__GroupElement__Group__09586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupElement__PathAssignment_0_in_rule__GroupElement__Group__0__Impl9613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupElement__Group__1__Impl_in_rule__GroupElement__Group__19643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupElement__Group_1__0_in_rule__GroupElement__Group__1__Impl9670 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__GroupElement__Group_1__0__Impl_in_rule__GroupElement__Group_1__09705 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_rule__GroupElement__Group_1__1_in_rule__GroupElement__Group_1__09708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__GroupElement__Group_1__0__Impl9736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupElement__Group_1__1__Impl_in_rule__GroupElement__Group_1__19767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GroupElement__PathAssignment_1_1_in_rule__GroupElement__Group_1__1__Impl9794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathElement__Group_1__0__Impl_in_rule__PathElement__Group_1__09828 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__PathElement__Group_1__1_in_rule__PathElement__Group_1__09831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PathElement__Group_1__0__Impl9859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathElement__Group_1__1__Impl_in_rule__PathElement__Group_1__19890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PathElement__Group_1__2_in_rule__PathElement__Group_1__19893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PathElement__Group_1__1__Impl9921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathElement__Group_1__2__Impl_in_rule__PathElement__Group_1__29952 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__PathElement__Group_1__3_in_rule__PathElement__Group_1__29955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathElement__TypeAssignment_1_2_in_rule__PathElement__Group_1__2__Impl9982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathElement__Group_1__3__Impl_in_rule__PathElement__Group_1__310012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PathElement__Group_1__3__Impl10040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LinkSpec__NameAssignment_110084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_rule__LinkSpec__ConstructorsAssignment_310115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Constructor__IsPublicAssignment_010151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constructor__NameAssignment_110190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constructor__ParametersAssignment_3_010221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Constructor__ParametersAssignment_3_1_110252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructorAddressParameters_in_rule__Constructor__AddressesAssignment_5_110283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_rule__Constructor__MembersAssignment_7_010314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamedAddresses__AddressNamesAssignment_110345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamedAddresses__AddressNamesAssignment_2_210376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddressTuple__ElementsAssignment_210407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddressTuple__ElementsAssignment_3_110438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkProperty_in_rule__TosNetLinkBinding__PropertiesAssignment_210469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkProperty_in_rule__TosNetLinkBinding__PropertiesAssignment_3_110500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LinkProperty__CtrlNameAssignment_0_210531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__LinkProperty__BaseValueAssignment_1_210562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LinkProperty__UartNameAssignment_2_210593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleExpansion__NameAssignment_010624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleExpansion__ConstructorAssignment_210659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__SimpleExpansion__ArgumentsAssignment_4_010694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__SimpleExpansion__ArgumentsAssignment_4_1_110725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressBinding_in_rule__SimpleExpansion__BindingsAssignment_6_010756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressBinding_in_rule__SimpleExpansion__BindingsAssignment_6_1_110787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddressExpansion__NameAssignment_110818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddressExpansion__ConstructorAssignment_310853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__AddressExpansion__ArgumentsAssignment_5_010888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__AddressExpansion__ArgumentsAssignment_5_1_110919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__SimpleAssignment_010950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__LhsAssignment_1_010981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Argument__RhsAssignment_1_211012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Argument__TextAssignment_211043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AddressBinding__NameAssignment_1_011074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_NUM_in_rule__AddressBinding__AddressesAssignment_311105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_NUM_in_rule__AddressBinding__AddressesAssignment_4_111136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressSpec_in_rule__Instantiation__AddressAssignment_111167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKind_in_rule__Instantiation__KindAssignment_311198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiationProperty_in_rule__Instantiation__PropertiesAssignment_5_011229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiationProperty_in_rule__Instantiation__PropertiesAssignment_5_1_111260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DirectAddressSpec__NameAssignment_011291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_NUM_in_rule__DirectAddressSpec__AddressAssignment_211322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamedAddressSpec__NameAssignment11353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__InstantiationProperty__IdAssignment_0_311384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__InstantiationProperty__ModeAssignment_2_311415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__InstantiationProperty__RateAssignment_2_511446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Grouping__NameAssignment_011477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupElement_in_rule__Grouping__ElementsAssignment_211508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGroupElement_in_rule__Grouping__ElementsAssignment_3_111539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathElement_in_rule__GroupElement__PathAssignment_011570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathElement_in_rule__GroupElement__PathAssignment_1_111601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PathElement__SimpleAssignment_011632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PathElement__TypeAssignment_1_211667 = new BitSet(new long[]{0x0000000000000002L});

}