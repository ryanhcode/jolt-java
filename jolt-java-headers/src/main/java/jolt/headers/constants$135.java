// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$135 {

    static final FunctionDescriptor JPC_SixDOFConstraintSettings_SetLimitedAxis$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_SixDOFConstraintSettings_SetLimitedAxis$MH = RuntimeHelper.downcallHandle(
        "JPC_SixDOFConstraintSettings_SetLimitedAxis",
        constants$135.JPC_SixDOFConstraintSettings_SetLimitedAxis$FUNC
    );
    static final FunctionDescriptor JPC_SixDOFConstraintSettings_GetMotorSettings$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_SixDOFConstraintSettings_GetMotorSettings$MH = RuntimeHelper.downcallHandle(
        "JPC_SixDOFConstraintSettings_GetMotorSettings",
        constants$135.JPC_SixDOFConstraintSettings_GetMotorSettings$FUNC
    );
    static final FunctionDescriptor JPC_GJKClosestPoint_IntersectsConvexConvex$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_GJKClosestPoint_IntersectsConvexConvex$MH = RuntimeHelper.downcallHandle(
        "JPC_GJKClosestPoint_IntersectsConvexConvex",
        constants$135.JPC_GJKClosestPoint_IntersectsConvexConvex$FUNC
    );
    static final FunctionDescriptor JPC_GJKClosestPoint_GetClosestPointsConvexConvex$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_GJKClosestPoint_GetClosestPointsConvexConvex$MH = RuntimeHelper.downcallHandle(
        "JPC_GJKClosestPoint_GetClosestPointsConvexConvex",
        constants$135.JPC_GJKClosestPoint_GetClosestPointsConvexConvex$FUNC
    );
    static final FunctionDescriptor JPC_GJKClosestPoint_IntersectsConvexPoint$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_GJKClosestPoint_IntersectsConvexPoint$MH = RuntimeHelper.downcallHandle(
        "JPC_GJKClosestPoint_IntersectsConvexPoint",
        constants$135.JPC_GJKClosestPoint_IntersectsConvexPoint$FUNC
    );
    static final FunctionDescriptor JPC_GJKClosestPoint_GetClosestPointsConvexPoint$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_GJKClosestPoint_GetClosestPointsConvexPoint$MH = RuntimeHelper.downcallHandle(
        "JPC_GJKClosestPoint_GetClosestPointsConvexPoint",
        constants$135.JPC_GJKClosestPoint_GetClosestPointsConvexPoint$FUNC
    );
}


