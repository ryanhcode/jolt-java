// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$62 {

    static final FunctionDescriptor JPC_BodyInterface_AssignBodyID$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_AssignBodyID$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_AssignBodyID",
        constants$62.JPC_BodyInterface_AssignBodyID$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_UnassignBodyID$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_UnassignBodyID$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_UnassignBodyID",
        constants$62.JPC_BodyInterface_UnassignBodyID$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_UnassignBodyIDs$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_UnassignBodyIDs$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_UnassignBodyIDs",
        constants$62.JPC_BodyInterface_UnassignBodyIDs$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_DestroyBody$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_DestroyBody$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_DestroyBody",
        constants$62.JPC_BodyInterface_DestroyBody$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_DestroyBodies$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_DestroyBodies$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_DestroyBodies",
        constants$62.JPC_BodyInterface_DestroyBodies$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_AddBody$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_AddBody$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_AddBody",
        constants$62.JPC_BodyInterface_AddBody$FUNC
    );
}


