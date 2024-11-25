<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:8634426e-5c51-4c64-bcfa-3d060ffd6b31(airport_management.structure)">
  <persistence version="9" />
  <languages>
    <devkit ref="78434eb8-b0e5-444b-850d-e7c4ad2da9ab(jetbrains.mps.devkit.aspect.structure)" />
  </languages>
  <imports>
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure">
      <concept id="3348158742936976480" name="jetbrains.mps.lang.structure.structure.EnumerationMemberDeclaration" flags="ng" index="25R33">
        <property id="1421157252384165432" name="memberId" index="3tVfz5" />
      </concept>
      <concept id="3348158742936976479" name="jetbrains.mps.lang.structure.structure.EnumerationDeclaration" flags="ng" index="25R3W">
        <child id="3348158742936976577" name="members" index="25R1y" />
      </concept>
      <concept id="1082978164218" name="jetbrains.mps.lang.structure.structure.DataTypeDeclaration" flags="ng" index="AxPO6">
        <property id="7791109065626895363" name="datatypeId" index="3F6X1D" />
      </concept>
      <concept id="1169125787135" name="jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" flags="ig" index="PkWjJ">
        <property id="6714410169261853888" name="conceptId" index="EcuMT" />
        <property id="4628067390765956802" name="abstract" index="R5$K7" />
        <child id="1071489727083" name="linkDeclaration" index="1TKVEi" />
        <child id="1071489727084" name="propertyDeclaration" index="1TKVEl" />
      </concept>
      <concept id="1071489090640" name="jetbrains.mps.lang.structure.structure.ConceptDeclaration" flags="ig" index="1TIwiD">
        <reference id="1071489389519" name="extends" index="1TJDcQ" />
      </concept>
      <concept id="1071489288299" name="jetbrains.mps.lang.structure.structure.PropertyDeclaration" flags="ig" index="1TJgyi">
        <property id="241647608299431129" name="propertyId" index="IQ2nx" />
        <reference id="1082985295845" name="dataType" index="AX2Wp" />
      </concept>
      <concept id="1071489288298" name="jetbrains.mps.lang.structure.structure.LinkDeclaration" flags="ig" index="1TJgyj">
        <property id="1071599776563" name="role" index="20kJfa" />
        <property id="241647608299431140" name="linkId" index="IQ2ns" />
        <reference id="1071599976176" name="target" index="20lvS9" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ngI" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="1TIwiD" id="4Jgod0HSvLZ">
    <property role="EcuMT" value="5462972795239660671" />
    <property role="TrG5h" value="Division" />
    <property role="R5$K7" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="1TJgyj" id="4Jgod0HSvNS" role="1TKVEi">
      <property role="IQ2ns" value="5462972795239660792" />
      <property role="20kJfa" value="floor" />
      <ref role="20lvS9" node="4Jgod0HSvMr" resolve="Floor" />
    </node>
    <node concept="1TJgyj" id="4Jgod0HSvNT" role="1TKVEi">
      <property role="IQ2ns" value="5462972795239660793" />
      <property role="20kJfa" value="commonAreas" />
      <ref role="20lvS9" node="4Jgod0HSvNk" resolve="CommonArea" />
    </node>
  </node>
  <node concept="1TIwiD" id="4Jgod0HSvM8">
    <property role="EcuMT" value="5462972795239660680" />
    <property role="TrG5h" value="Area" />
    <property role="R5$K7" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
  </node>
  <node concept="1TIwiD" id="4Jgod0HSvMc">
    <property role="EcuMT" value="5462972795239660684" />
    <property role="TrG5h" value="Terminal" />
    <ref role="1TJDcQ" node="4Jgod0HSvLZ" resolve="Division" />
    <node concept="1TJgyj" id="4Jgod0HSvNY" role="1TKVEi">
      <property role="IQ2ns" value="5462972795239660798" />
      <property role="20kJfa" value="dropOff" />
      <ref role="20lvS9" node="4Jgod0HSvMI" resolve="DropOff" />
    </node>
    <node concept="1TJgyj" id="4Jgod0HSvNZ" role="1TKVEi">
      <property role="IQ2ns" value="5462972795239660799" />
      <property role="20kJfa" value="floors" />
      <ref role="20lvS9" node="4Jgod0HSvMr" resolve="Floor" />
    </node>
    <node concept="1TJgyj" id="4Jgod0HSvO0" role="1TKVEi">
      <property role="IQ2ns" value="5462972795239660800" />
      <property role="20kJfa" value="airside" />
      <ref role="20lvS9" node="4Jgod0HSvMv" resolve="Airside" />
    </node>
    <node concept="1TJgyj" id="4Jgod0HSvO1" role="1TKVEi">
      <property role="IQ2ns" value="5462972795239660801" />
      <property role="20kJfa" value="landside" />
      <ref role="20lvS9" node="4Jgod0HSvM_" resolve="Landside" />
    </node>
  </node>
  <node concept="1TIwiD" id="4Jgod0HSvMr">
    <property role="EcuMT" value="5462972795239660699" />
    <property role="TrG5h" value="Floor" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
  </node>
  <node concept="1TIwiD" id="4Jgod0HSvMt">
    <property role="EcuMT" value="5462972795239660701" />
    <property role="TrG5h" value="Elevator" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
  </node>
  <node concept="1TIwiD" id="4Jgod0HSvMv">
    <property role="EcuMT" value="5462972795239660703" />
    <property role="TrG5h" value="Airside" />
    <ref role="1TJDcQ" node="4Jgod0HSvM8" resolve="Area" />
    <node concept="1TJgyj" id="4Jgod0HSvNq" role="1TKVEi">
      <property role="IQ2ns" value="5462972795239660762" />
      <property role="20kJfa" value="gateArea" />
      <ref role="20lvS9" node="4Jgod0HSvN7" resolve="GateArea" />
    </node>
  </node>
  <node concept="1TIwiD" id="4Jgod0HSvM_">
    <property role="EcuMT" value="5462972795239660709" />
    <property role="TrG5h" value="Landside" />
    <ref role="1TJDcQ" node="4Jgod0HSvM8" resolve="Area" />
    <node concept="1TJgyj" id="4Jgod0HSvNW" role="1TKVEi">
      <property role="IQ2ns" value="5462972795239660796" />
      <property role="20kJfa" value="departureArea" />
      <ref role="20lvS9" node="4Jgod0HSvMK" resolve="Departure" />
    </node>
    <node concept="1TJgyj" id="4Jgod0HSvNX" role="1TKVEi">
      <property role="IQ2ns" value="5462972795239660797" />
      <property role="20kJfa" value="arrivalArea" />
      <ref role="20lvS9" node="4Jgod0HSvMV" resolve="Arrival" />
    </node>
  </node>
  <node concept="1TIwiD" id="4Jgod0HSvMI">
    <property role="EcuMT" value="5462972795239660718" />
    <property role="TrG5h" value="DropOff" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
  </node>
  <node concept="1TIwiD" id="4Jgod0HSvMK">
    <property role="EcuMT" value="5462972795239660720" />
    <property role="TrG5h" value="Departure" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="1TJgyj" id="4Jgod0HSvNL" role="1TKVEi">
      <property role="IQ2ns" value="5462972795239660785" />
      <property role="20kJfa" value="security" />
      <ref role="20lvS9" node="4Jgod0HSvNf" resolve="SecurityCheck" />
    </node>
    <node concept="1TJgyj" id="4Jgod0HSvNM" role="1TKVEi">
      <property role="IQ2ns" value="5462972795239660786" />
      <property role="20kJfa" value="checkIn" />
      <ref role="20lvS9" node="4Jgod0HSvNi" resolve="CheckIn" />
    </node>
    <node concept="1TJgyj" id="4Jgod0HSvO5" role="1TKVEi">
      <property role="IQ2ns" value="5462972795239660805" />
      <property role="20kJfa" value="baggageDropOff" />
      <ref role="20lvS9" node="4Jgod0HSvO3" resolve="BaggageDropOff" />
    </node>
  </node>
  <node concept="1TIwiD" id="4Jgod0HSvMV">
    <property role="EcuMT" value="5462972795239660731" />
    <property role="TrG5h" value="Arrival" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="1TJgyj" id="4Jgod0HSvNH" role="1TKVEi">
      <property role="IQ2ns" value="5462972795239660781" />
      <property role="20kJfa" value="baggageClaim" />
      <ref role="20lvS9" node="4Jgod0HSvN5" resolve="BaggageClaim" />
    </node>
    <node concept="1TJgyj" id="4Jgod0HSvNI" role="1TKVEi">
      <property role="IQ2ns" value="5462972795239660782" />
      <property role="20kJfa" value="customs" />
      <ref role="20lvS9" node="4Jgod0HSvN3" resolve="Customs" />
    </node>
  </node>
  <node concept="1TIwiD" id="4Jgod0HSvN3">
    <property role="EcuMT" value="5462972795239660739" />
    <property role="TrG5h" value="Customs" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
  </node>
  <node concept="1TIwiD" id="4Jgod0HSvN5">
    <property role="EcuMT" value="5462972795239660741" />
    <property role="TrG5h" value="BaggageClaim" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
  </node>
  <node concept="1TIwiD" id="4Jgod0HSvN7">
    <property role="EcuMT" value="5462972795239660743" />
    <property role="TrG5h" value="GateArea" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="1TJgyj" id="4Jgod0HSvNV" role="1TKVEi">
      <property role="IQ2ns" value="5462972795239660795" />
      <property role="20kJfa" value="gates" />
      <ref role="20lvS9" node="4Jgod0HSvNc" resolve="Gate" />
    </node>
  </node>
  <node concept="1TIwiD" id="4Jgod0HSvNc">
    <property role="EcuMT" value="5462972795239660748" />
    <property role="TrG5h" value="Gate" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
  </node>
  <node concept="1TIwiD" id="4Jgod0HSvNf">
    <property role="EcuMT" value="5462972795239660751" />
    <property role="TrG5h" value="SecurityCheck" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
  </node>
  <node concept="1TIwiD" id="4Jgod0HSvNi">
    <property role="EcuMT" value="5462972795239660754" />
    <property role="TrG5h" value="CheckIn" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
  </node>
  <node concept="1TIwiD" id="4Jgod0HSvNk">
    <property role="EcuMT" value="5462972795239660756" />
    <property role="TrG5h" value="CommonArea" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="1TJgyi" id="4Jgod0HSvNn" role="1TKVEl">
      <property role="IQ2nx" value="5462972795239660759" />
      <property role="TrG5h" value="type" />
      <ref role="AX2Wp" node="4Jgod0HSvNs" resolve="CommonAreaType" />
    </node>
  </node>
  <node concept="25R3W" id="4Jgod0HSvNs">
    <property role="3F6X1D" value="5462972795239660764" />
    <property role="TrG5h" value="CommonAreaType" />
    <node concept="25R33" id="4Jgod0HSvNt" role="25R1y">
      <property role="3tVfz5" value="5462972795239660765" />
      <property role="TrG5h" value="Sitting" />
    </node>
    <node concept="25R33" id="4Jgod0HSvNw" role="25R1y">
      <property role="3tVfz5" value="5462972795239660768" />
      <property role="TrG5h" value="Dining" />
    </node>
    <node concept="25R33" id="4Jgod0HSvNy" role="25R1y">
      <property role="3tVfz5" value="5462972795239660770" />
      <property role="TrG5h" value="Working" />
    </node>
    <node concept="25R33" id="4Jgod0HSvN$" role="25R1y">
      <property role="3tVfz5" value="5462972795239660772" />
      <property role="TrG5h" value="Parking" />
    </node>
    <node concept="25R33" id="4Jgod0HSvNA" role="25R1y">
      <property role="3tVfz5" value="5462972795239660774" />
      <property role="TrG5h" value="Restroom" />
    </node>
    <node concept="25R33" id="4Jgod0HSvNC" role="25R1y">
      <property role="3tVfz5" value="5462972795239660776" />
      <property role="TrG5h" value="Retail" />
    </node>
    <node concept="25R33" id="4Jgod0HSvNE" role="25R1y">
      <property role="3tVfz5" value="5462972795239660778" />
      <property role="TrG5h" value="Lounge" />
    </node>
  </node>
  <node concept="1TIwiD" id="4Jgod0HSvO3">
    <property role="EcuMT" value="5462972795239660803" />
    <property role="TrG5h" value="BaggageDropOff" />
    <ref role="1TJDcQ" node="4Jgod0HSvMK" resolve="Departure" />
  </node>
</model>

