/*
* By downloading the PROGRAM you agree to the following terms of use:
* 
* BROAD INSTITUTE
* SOFTWARE LICENSE AGREEMENT
* FOR ACADEMIC NON-COMMERCIAL RESEARCH PURPOSES ONLY
* 
* This Agreement is made between the Broad Institute, Inc. with a principal address at 415 Main Street, Cambridge, MA 02142 (“BROAD”) and the LICENSEE and is effective at the date the downloading is completed (“EFFECTIVE DATE”).
* 
* WHEREAS, LICENSEE desires to license the PROGRAM, as defined hereinafter, and BROAD wishes to have this PROGRAM utilized in the public interest, subject only to the royalty-free, nonexclusive, nontransferable license rights of the United States Government pursuant to 48 CFR 52.227-14; and
* WHEREAS, LICENSEE desires to license the PROGRAM and BROAD desires to grant a license on the following terms and conditions.
* NOW, THEREFORE, in consideration of the promises and covenants made herein, the parties hereto agree as follows:
* 
* 1. DEFINITIONS
* 1.1 PROGRAM shall mean copyright in the object code and source code known as GATK3 and related documentation, if any, as they exist on the EFFECTIVE DATE and can be downloaded from http://www.broadinstitute.org/gatk on the EFFECTIVE DATE.
* 
* 2. LICENSE
* 2.1 Grant. Subject to the terms of this Agreement, BROAD hereby grants to LICENSEE, solely for academic non-commercial research purposes, a non-exclusive, non-transferable license to: (a) download, execute and display the PROGRAM and (b) create bug fixes and modify the PROGRAM. LICENSEE hereby automatically grants to BROAD a non-exclusive, royalty-free, irrevocable license to any LICENSEE bug fixes or modifications to the PROGRAM with unlimited rights to sublicense and/or distribute.  LICENSEE agrees to provide any such modifications and bug fixes to BROAD promptly upon their creation.
* The LICENSEE may apply the PROGRAM in a pipeline to data owned by users other than the LICENSEE and provide these users the results of the PROGRAM provided LICENSEE does so for academic non-commercial purposes only. For clarification purposes, academic sponsored research is not a commercial use under the terms of this Agreement.
* 2.2 No Sublicensing or Additional Rights. LICENSEE shall not sublicense or distribute the PROGRAM, in whole or in part, without prior written permission from BROAD. LICENSEE shall ensure that all of its users agree to the terms of this Agreement. LICENSEE further agrees that it shall not put the PROGRAM on a network, server, or other similar technology that may be accessed by anyone other than the LICENSEE and its employees and users who have agreed to the terms of this agreement.
* 2.3 License Limitations. Nothing in this Agreement shall be construed to confer any rights upon LICENSEE by implication, estoppel, or otherwise to any computer software, trademark, intellectual property, or patent rights of BROAD, or of any other entity, except as expressly granted herein. LICENSEE agrees that the PROGRAM, in whole or part, shall not be used for any commercial purpose, including without limitation, as the basis of a commercial software or hardware product or to provide services. LICENSEE further agrees that the PROGRAM shall not be copied or otherwise adapted in order to circumvent the need for obtaining a license for use of the PROGRAM.
* 
* 3. PHONE-HOME FEATURE
* LICENSEE expressly acknowledges that the PROGRAM contains an embedded automatic reporting system (“PHONE-HOME”) which is enabled by default upon download. Unless LICENSEE requests disablement of PHONE-HOME, LICENSEE agrees that BROAD may collect limited information transmitted by PHONE-HOME regarding LICENSEE and its use of the PROGRAM.  Such information shall include LICENSEE’S user identification, version number of the PROGRAM and tools being run, mode of analysis employed, and any error reports generated during run-time.  Collection of such information is used by BROAD solely to monitor usage rates, fulfill reporting requirements to BROAD funding agencies, drive improvements to the PROGRAM, and facilitate adjustments to PROGRAM-related documentation.
* 
* 4. OWNERSHIP OF INTELLECTUAL PROPERTY
* LICENSEE acknowledges that title to the PROGRAM shall remain with BROAD. The PROGRAM is marked with the following BROAD copyright notice and notice of attribution to contributors. LICENSEE shall retain such notice on all copies. LICENSEE agrees to include appropriate attribution if any results obtained from use of the PROGRAM are included in any publication.
* Copyright 2012-2015 Broad Institute, Inc.
* Notice of attribution: The GATK3 program was made available through the generosity of Medical and Population Genetics program at the Broad Institute, Inc.
* LICENSEE shall not use any trademark or trade name of BROAD, or any variation, adaptation, or abbreviation, of such marks or trade names, or any names of officers, faculty, students, employees, or agents of BROAD except as states above for attribution purposes.
* 
* 5. INDEMNIFICATION
* LICENSEE shall indemnify, defend, and hold harmless BROAD, and their respective officers, faculty, students, employees, associated investigators and agents, and their respective successors, heirs and assigns, (Indemnitees), against any liability, damage, loss, or expense (including reasonable attorneys fees and expenses) incurred by or imposed upon any of the Indemnitees in connection with any claims, suits, actions, demands or judgments arising out of any theory of liability (including, without limitation, actions in the form of tort, warranty, or strict liability and regardless of whether such action has any factual basis) pursuant to any right or license granted under this Agreement.
* 
* 6. NO REPRESENTATIONS OR WARRANTIES
* THE PROGRAM IS DELIVERED AS IS. BROAD MAKES NO REPRESENTATIONS OR WARRANTIES OF ANY KIND CONCERNING THE PROGRAM OR THE COPYRIGHT, EXPRESS OR IMPLIED, INCLUDING, WITHOUT LIMITATION, WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, NONINFRINGEMENT, OR THE ABSENCE OF LATENT OR OTHER DEFECTS, WHETHER OR NOT DISCOVERABLE. BROAD EXTENDS NO WARRANTIES OF ANY KIND AS TO PROGRAM CONFORMITY WITH WHATEVER USER MANUALS OR OTHER LITERATURE MAY BE ISSUED FROM TIME TO TIME.
* IN NO EVENT SHALL BROAD OR ITS RESPECTIVE DIRECTORS, OFFICERS, EMPLOYEES, AFFILIATED INVESTIGATORS AND AFFILIATES BE LIABLE FOR INCIDENTAL OR CONSEQUENTIAL DAMAGES OF ANY KIND, INCLUDING, WITHOUT LIMITATION, ECONOMIC DAMAGES OR INJURY TO PROPERTY AND LOST PROFITS, REGARDLESS OF WHETHER BROAD SHALL BE ADVISED, SHALL HAVE OTHER REASON TO KNOW, OR IN FACT SHALL KNOW OF THE POSSIBILITY OF THE FOREGOING.
* 
* 7. ASSIGNMENT
* This Agreement is personal to LICENSEE and any rights or obligations assigned by LICENSEE without the prior written consent of BROAD shall be null and void.
* 
* 8. MISCELLANEOUS
* 8.1 Export Control. LICENSEE gives assurance that it will comply with all United States export control laws and regulations controlling the export of the PROGRAM, including, without limitation, all Export Administration Regulations of the United States Department of Commerce. Among other things, these laws and regulations prohibit, or require a license for, the export of certain types of software to specified countries.
* 8.2 Termination. LICENSEE shall have the right to terminate this Agreement for any reason upon prior written notice to BROAD. If LICENSEE breaches any provision hereunder, and fails to cure such breach within thirty (30) days, BROAD may terminate this Agreement immediately. Upon termination, LICENSEE shall provide BROAD with written assurance that the original and all copies of the PROGRAM have been destroyed, except that, upon prior written authorization from BROAD, LICENSEE may retain a copy for archive purposes.
* 8.3 Survival. The following provisions shall survive the expiration or termination of this Agreement: Articles 1, 3, 4, 5 and Sections 2.2, 2.3, 7.3, and 7.4.
* 8.4 Notice. Any notices under this Agreement shall be in writing, shall specifically refer to this Agreement, and shall be sent by hand, recognized national overnight courier, confirmed facsimile transmission, confirmed electronic mail, or registered or certified mail, postage prepaid, return receipt requested. All notices under this Agreement shall be deemed effective upon receipt.
* 8.5 Amendment and Waiver; Entire Agreement. This Agreement may be amended, supplemented, or otherwise modified only by means of a written instrument signed by all parties. Any waiver of any rights or failure to act in a specific instance shall relate only to such instance and shall not be construed as an agreement to waive any rights or fail to act in any other instance, whether or not similar. This Agreement constitutes the entire agreement among the parties with respect to its subject matter and supersedes prior agreements or understandings between the parties relating to its subject matter.
* 8.6 Binding Effect; Headings. This Agreement shall be binding upon and inure to the benefit of the parties and their respective permitted successors and assigns. All headings are for convenience only and shall not affect the meaning of any provision of this Agreement.
* 8.7 Governing Law. This Agreement shall be construed, governed, interpreted and applied in accordance with the internal laws of the Commonwealth of Massachusetts, U.S.A., without regard to conflict of laws principles.
*/

package org.broadinstitute.gatk.tools.walkers.annotator;

import org.apache.log4j.Logger;

import org.broadinstitute.gatk.engine.samples.Trio;
import org.broadinstitute.gatk.engine.walkers.Walker;
import org.broadinstitute.gatk.tools.walkers.annotator.interfaces.AnnotatorCompatible;
import org.broadinstitute.gatk.tools.walkers.annotator.interfaces.ExperimentalAnnotation;
import org.broadinstitute.gatk.tools.walkers.annotator.interfaces.InfoFieldAnnotation;
import org.broadinstitute.gatk.tools.walkers.annotator.interfaces.RodRequiringAnnotation;
import org.broadinstitute.gatk.utils.contexts.AlignmentContext;
import org.broadinstitute.gatk.utils.contexts.ReferenceContext;
import org.broadinstitute.gatk.utils.genotyper.PerReadAlleleLikelihoodMap;
import org.broadinstitute.gatk.utils.refdata.RefMetaDataTracker;
import org.broadinstitute.gatk.engine.samples.MendelianViolation;
import htsjdk.variant.variantcontext.VariantContext;
import org.broadinstitute.gatk.utils.variant.GATKVCFConstants;

import java.util.*;

/**
 * Existence of a de novo mutation in at least one of the given families
 *
 * <p>This annotation uses the genotype information from individuals in family trios to identify possible de novo mutations and the sample(s) in which they occur. This works best if the genotypes have been processed according to the <a href="https://www.broadinstitute.org/gatk/guide/article?id=4723">Genotype Refinement workflow</a>.</p>
 *
 * <h3>Caveats</h3>
 * <ul>
 *     <li>The calculation assumes that the organism is diploid.</li>
 *     <li>This annotation requires a valid pedigree file.</li>
 *     <li>Only reports possible de novos for children whose genotypes have not been tagged as filtered (which is most appropriate if parent likelihoods
 * have already been factored in using PhaseByTransmission).</li>
 *     <li>When multiple trios are present, the annotation is simply the maximum of the likelihood ratios, rather than the strict 1-Prod(1-p_i) calculation, as this can scale poorly for uncertain sites and many trios.</li>
 *     <li>This annotation can only be used from the Variant Annotator. If you attempt to use it from the UnifiedGenotyper, the run will fail with an error message to that effect. If you attempt to use it from the HaplotypeCaller, the run will complete successfully but the annotation will not be added to any variants.</li>
 * </ul>
 *
 * <h3>Related annotations</h3>
 * <ul>
 *     <li><b><a href="https://www.broadinstitute.org/gatk/guide/tooldocs/org_broadinstitute_gatk_tools_walkers_annotator_MVLikelihoodRatio.php">MVLikelihoodRatio</a></b> evaluates whether a site is transmitted from parents to offspring according to Mendelian rules or not.</li>
 * </ul>
 *
 */

public class PossibleDeNovo extends InfoFieldAnnotation implements RodRequiringAnnotation, ExperimentalAnnotation {

    private final static Logger logger = Logger.getLogger(PossibleDeNovo.class);

    private MendelianViolation mendelianViolation = null;
    private final int hi_GQ_threshold = 20; //WARNING - If you change this value, update the description in GATKVCFHeaderLines
    private final int lo_GQ_threshold = 10; //WARNING - If you change this value, update the description in GATKVCFHeaderLines
    private final double percentOfSamplesCutoff = 0.001; //for many, many samples use 0.1% of samples as allele frequency threshold for de novos
    private final int flatNumberOfSamplesCutoff = 4;
    private Set<Trio> trios;
    private boolean walkerIdentityCheckWarningLogged = false;
    private boolean pedigreeCheckWarningLogged = false;

    public Map<String, Object> annotate(final RefMetaDataTracker tracker,
                                        final AnnotatorCompatible walker,
                                        final ReferenceContext ref,
                                        final Map<String, AlignmentContext> stratifiedContexts,
                                        final VariantContext vc,
                                        final Map<String, PerReadAlleleLikelihoodMap> stratifiedPerReadAlleleLikelihoodMap) {

        if ( !(walker instanceof VariantAnnotator ) ) {
            if ( !walkerIdentityCheckWarningLogged ) {
                if ( walker != null )
                    logger.warn("Annotation will not be calculated, must be called from VariantAnnotator, not " + walker.getClass().getName());
                else
                    logger.warn("Annotation will not be calculated, must be called from VariantAnnotator");
                walkerIdentityCheckWarningLogged = true;
            }
            return null;
        }

        if ( mendelianViolation == null ) {
            trios = ((Walker) walker).getSampleDB().getTrios();
            if ( trios.isEmpty() ) {
                if ( !pedigreeCheckWarningLogged ) {
                    logger.warn("Annotation will not be calculated, must provide a valid PED file (-ped) from the command line.");
                    pedigreeCheckWarningLogged = true;
                }
                return null;
            }
            mendelianViolation = new MendelianViolation(((VariantAnnotator)walker).minGenotypeQualityP );
        }

        final Map<String,Object> attributeMap = new HashMap<>(1);
        boolean isHighConfDeNovo = false;
        boolean isLowConfDeNovo = false;
        final List<String> highConfDeNovoChildren = new ArrayList<>();
        final List<String> lowConfDeNovoChildren = new ArrayList<>();
        for ( final Trio trio : trios ) {
            if (vc.isBiallelic() && contextHasTrioLikelihoods(vc,trio) && mendelianViolation.isViolation(trio.getMother(),trio.getFather(),trio.getChild(),vc) )
            {
                  if (mendelianViolation.getParentsRefRefChildHet() > 0)   {
                         if ((vc.getGenotype(trio.getChildID()).getGQ() >= hi_GQ_threshold) && (vc.getGenotype(trio.getMaternalID()).getGQ()) >= hi_GQ_threshold && (vc.getGenotype(trio.getPaternalID()).getGQ() >= hi_GQ_threshold))
                         {
                             highConfDeNovoChildren.add(trio.getChildID());
                             isHighConfDeNovo = true;
                         }
                         else if ((vc.getGenotype(trio.getChildID()).getGQ() >= lo_GQ_threshold) && (vc.getGenotype(trio.getMaternalID()).getGQ()) > 0 && (vc.getGenotype(trio.getPaternalID()).getGQ() > 0))
                         {
                             lowConfDeNovoChildren.add(trio.getChildID());
                             isLowConfDeNovo = true;
                         }
                  }
            }
        }

        final double percentNumberOfSamplesCutoff = vc.getNSamples()*percentOfSamplesCutoff;
        final double AFcutoff = Math.max(flatNumberOfSamplesCutoff,percentNumberOfSamplesCutoff);
        final int deNovoAlleleCount = vc.getCalledChrCount(vc.getAlternateAllele(0)); //we assume we're biallelic above so use the first alt
        if ( isHighConfDeNovo  && deNovoAlleleCount < AFcutoff )
            attributeMap.put(GATKVCFConstants.HI_CONF_DENOVO_KEY,highConfDeNovoChildren);
        if ( isLowConfDeNovo  && deNovoAlleleCount < AFcutoff )
            attributeMap.put(GATKVCFConstants.LO_CONF_DENOVO_KEY,lowConfDeNovoChildren);
        return attributeMap;
    }

    // return the descriptions used for the VCF INFO meta field
    @Override
    public List<String> getKeyNames() { return Arrays.asList(GATKVCFConstants.HI_CONF_DENOVO_KEY, GATKVCFConstants.LO_CONF_DENOVO_KEY); }

    private boolean contextHasTrioLikelihoods(VariantContext context, Trio trio) {
        for ( String sample : Arrays.asList(trio.getMaternalID(),trio.getPaternalID(),trio.getChildID()) ) {
            if (trio.getMaternalID().isEmpty() || trio.getPaternalID().isEmpty() || trio.getChildID().isEmpty())
                return false;
            if ( ! context.hasGenotype(sample) )
                return false;
            if ( ! context.getGenotype(sample).hasLikelihoods() )
                return false;
        }

        return true;
    }

}

